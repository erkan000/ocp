package date.time;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		Instant first = Instant.now();
		System.out.println(first);
		Instant second = Instant.now();
		
		Duration elapsed = Duration.between(first, second);
		System.out.println(elapsed.getNano());
		
	}

}
