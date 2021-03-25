package chapter10.sample;

public class YieldOrnek extends Thread {

    public void run() {
	for (int i=0 ; i<5; i++) {
	    System.out.println(this.getName()+"<->" + i);
	    Thread.yield(); // 9
//	     this.yield();  // bu da dogru
	}

    }

    public static void main(String args[]) throws Exception {
	
	YieldOrnek yo1 = new YieldOrnek();
	YieldOrnek yo2 = new YieldOrnek();
	YieldOrnek yo3 = new YieldOrnek();
	
	// tum is parcaciklari ayni oncelik sirasina sahip = 5

	yo1.start();
	assert false;
	yo2.start();
	yo3.start();
    }
}

