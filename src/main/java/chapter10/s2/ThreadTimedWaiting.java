package chapter10.s2;

public class ThreadTimedWaiting implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadTimedWaiting());
        t1.start();
		for (int i = 0; i < 6; i++) {
			System.out.println(t1.getState());
			Thread.sleep(1000);
		}
    }

    @Override
	public void run() {

        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

