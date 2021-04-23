package date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Create {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime dateTimeZone = ZonedDateTime.now();
		
		date = LocalDate.of(2021, 12, 31);      // Month.OCTOBER
		time = LocalTime.of(23, 59);
		time = LocalTime.of(23, 59, 0);
		time = LocalTime.of(23, 59, 0, 0);
		dateTime = LocalDateTime.of(2021, 12, 31, 23, 59, 0);
		dateTimeZone = ZonedDateTime.of(dateTime, ZoneId.of("UTC"));

		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(dateTimeZone);
		
		dateTime = LocalDateTime.of(date, time);		

	}

}
