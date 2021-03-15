package chapter11.s2;

import java.util.concurrent.locks.*;
class Bus2 {
	Lock lock = new ReentrantLock();
	public void boardBus(String name) {
		System.out.println(name + ": boarded");
	}
}
public class TwistInTale_11_1 extends Thread {
	Bus2 bus;
	String name;
	TwistInTale_11_1(String name, Bus2 bus) {
		this.bus = bus;
		this.name = name;
	}
	public void run() {
		try {
			bus.lock.lockInterruptibly();
			bus.boardBus(name);
		}
		catch (InterruptedException e) {
			System.out.println(name + ": Interrupted!!");
			Thread.currentThread().interrupt();
		}
		finally {
			bus.lock.unlock();
		}
	}
	public static void main(String args[]) {
		TwistInTale_11_1 e1 = new TwistInTale_11_1("Paul", new Bus2());
		e1.start();
		e1.interrupt();
	}
}
