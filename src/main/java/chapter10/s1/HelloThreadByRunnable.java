package chapter10.s1;

public class HelloThreadByRunnable {

	public static void main(String[] args) {
		Thread read = new Thread(new Read());
		read.start();
		System.out.println("Dancing");
		System.out.println(read.getName());
	}

}

class Read implements Runnable{

	@Override
	public void run() {
		System.out.println("Reading book");
	}
	
}