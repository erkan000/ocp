package chapter10.s1;

public class HelloThreadByLambda {

	public static void main(String[] args) {
		Thread read = new Thread(() -> {
			System.out.println("read by lampda");
		});
		read.start();
	}

}