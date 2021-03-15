package chapter11.s3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Hotel2 {

	ExecutorService service = Executors.newFixedThreadPool(5);
	public void orderFood(Order2 order) {
		//Submit Callable to ExecutorService for execution.
		service.submit(order);
	}
	public void hotelClosedForDay() {
		//Disable new tasks from being submitted
		service.shutdown();
	}
	public void hotelClosedForever() {
		service.shutdown();
		try {
			if (!service.awaitTermination(60, TimeUnit.SECONDS)) {
				service.shutdownNow();
				if (!service.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			service.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}

class Order2 implements Callable<Void> {
	String name;
	Order2(String name) {this.name = name;}
	public Void call() throws Exception {
		System.out.println(name);
		if (name.equalsIgnoreCase("berry"))
			throw new Exception("Berry unavailable");
		return null;
	}
}
