package chapter11.s3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

// Burada 1 ce 2 numaralı satırlar Thread'i farklı çalıştırma yöntemleridir.
// ilk yöntemde çalışma sırası garanti edilmez.
// ikinci yöntemde ise her zaman aynı sıradır.
// açıklaması twist in tale 11.2 de var.

public class Hotel implements Executor {
	final Queue<Runnable> custQueue = new ArrayDeque<>();
	
	public void execute(Runnable r) {
		synchronized(custQueue) {
			custQueue.offer(r);
		}
		processEarliestOrder();
	}
	
	private void processEarliestOrder() {
		synchronized(custQueue) {
			Runnable task = custQueue.poll();
			// No:1
			//new Thread(task).start();
			
			// No:2
			task.run();
		}
	}
	
	public static void main(String args[]) {
		Hotel hotel = new Hotel();
		hotel.execute(new Order("tea"));
		hotel.execute(new Order("coffee"));
		hotel.execute(new Order("burger"));
		}
}

class Order implements Runnable {
	String name;
	Order(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name);
	}
}

