package chapter10.s1;

public class HelloThread {

	public static void main(String[] args) {
		Thread sing = new Sing();
		sing.start();
		System.out.println("Dancing");
		for (int i = 0; i < 20; i++) {
			System.out.println("Main thread = " + i);			
		}
	}

}

class Sing extends Thread{
	public void run() {
		System.out.println("Singing.......");
		for (int i = 0; i < 20; i++) {
			System.out.println("Diger thread = " + i);			
		}
	}
}