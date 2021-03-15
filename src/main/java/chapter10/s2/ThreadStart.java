package chapter10.s2;

public class ThreadStart {

	public static void main2(String[] args) {
		Thread sing = new Sing();
		sing.start();
		sing.start();
		// YENİ BİR THREAD BAŞLAR
	}
	
	public static void main(String[] args) {
		Thread sing = new Sing();
		sing.run();
		sing.run();
		// YENİ BİR THREAD BAŞLAMAZ!
	}

}

class Sing extends Thread{
	public void run() {
		System.out.println("Singing");
	}
}
