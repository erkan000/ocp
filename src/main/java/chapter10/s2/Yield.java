package chapter10.s2;

class Yield {
	public static void main(String args[]) {
		Thread sing = new Sing2();
		sing.start();
		Thread.yield();
		System.out.println("main");
	}
}

class Sing2 extends Thread{
	public void run() {
		yield();
		System.out.println("Singing");
	}
}