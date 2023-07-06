package chapter10.s2;

public class ThreadWaiting implements Runnable {

    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new ThreadWaiting());
        t1.start();
    }

    @Override
	public void run() {
        Thread t2 = new Thread(new WaitingStateRunnable());
        t2.start();

        try {
			System.out.println("t1 join : " + t1.getState());
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
		System.out.println("t1 continue : " + t1.getState());
    }
}

class WaitingStateRunnable implements Runnable {

    @Override
	public void run() {
		System.out.println("t2 started : " + Thread.currentThread().getState());
        try {
			Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        
		System.out.println("t1 state : " + ThreadWaiting.t1.getState());
    }
}