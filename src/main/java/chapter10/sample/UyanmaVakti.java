package chapter10.sample;

public class UyanmaVakti extends Thread {
	
	public void run() {
		try {
			for (;;) {
				System.out.println("uyuyor....");
				Thread.sleep(60 * 100);
			}
		} catch (InterruptedException iEx) {
			iEx.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws Exception{
		UyanmaVakti uv = new UyanmaVakti(); 
		uv.start();
		Thread.sleep(10000);
		uv.interrupt(); // normalde sonsuz d�ng�, thread sonlanmayacak iken, interrupt ile sonland�r�yoruz.
	}
}
