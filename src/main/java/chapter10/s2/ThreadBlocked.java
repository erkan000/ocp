package chapter10.s2;

public class ThreadBlocked {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new InfiniteProcess());
        Thread t2 = new Thread(new InfiniteProcess());
        
        t1.start();
        t2.start();
        
		Thread.sleep(1000);
        
        System.out.println(t2.getState());

		Thread.sleep(1000);

        System.exit(0);
    }
}

class InfiniteProcess implements Runnable {

    @Override
    public void run() {
        commonResource();
    }
    
    public static synchronized void commonResource() {

        while(true) {
			// infinite loop
        }

    }
}
