package chapter10.sample;


class OrtakAlan {

	private static int deger;
	
	public synchronized static int sayiVer() {
		deger++;
		System.out.println( Thread.currentThread().getName() + "-->" + deger);
		return deger;
	}
}

public class SynchronizedStaticTest extends Thread { 

	public void run() {
		for (int i=0; i<5; i++) {
			OrtakAlan.sayiVer();
		}
	}

	public static void main(String args[]) throws Exception {
		SynchronizedStaticTest st1 = new SynchronizedStaticTest();
		SynchronizedStaticTest st2 = new SynchronizedStaticTest();
		SynchronizedStaticTest st3 = new SynchronizedStaticTest();
		SynchronizedStaticTest st4 = new SynchronizedStaticTest();

		st1.start();
		st2.start();
		st3.start();
		st4.start();
	}
}
