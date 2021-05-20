package date.time;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(8, 30) ; // 08:30
		System.out.println(time);

		System.out.println(time.plusHours(1));

		System.out.println(time.plusMinutes(43));
	}
}
