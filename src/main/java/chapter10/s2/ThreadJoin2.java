package chapter10.s2;

public class ThreadJoin2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t2 = new SampleThread();
		t2.start();
		System.out.println("Main Thread started and will wait");
		t2.join();
		System.out.println("Main Thread returrned from join");
	}
}

class SampleThread extends Thread {

	@Override
	public void run() {
		int processingCount = 5;
		while (processingCount > 0) {
			try {
				System.out.println(this.getName() + " waiting");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			processingCount--;
		}
		System.out.println(this.getName() + " exiting");
	}
}