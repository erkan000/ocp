package chapter11.s3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableTest {
	
	public static void main(String[] args) throws InterruptedException {
		Callable<String> c1 = () -> { Thread.sleep(1000); System.out.println("11"); return "1"; };
		Callable<String> c2 = () -> { Thread.sleep(2000); System.out.println("22"); return "2"; };
		
		ExecutorService ex = Executors.newSingleThreadExecutor();

		ex.submit(c1);
		ex.submit(c2);
//		Collection<Callable<String>> tasks = List.of(c1,c2);
//		ex.invokeAll(tasks);
		
		ex.shutdown();
		ex.awaitTermination(1, TimeUnit.MINUTES);
		
		System.out.println("bitti");
	}

}
