package date.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate birth = LocalDate.of(1990, Month.DECEMBER, 31);
		System.out.println(birth);
		
		Period p = birth.until(now);
		System.out.println(p.getYears() + " years old.");
		
		long days = birth.until(now, ChronoUnit.DAYS);
		System.out.println(days + " days passed away...");
		
		LocalDate nextSunday =
				now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(nextSunday);
		
		System.out.println(LocalDate.parse("2016-06-10").isAfter(LocalDate.parse("2016-06-11")));
		System.out.println(LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(LocalDate.parse("2017-02-22").with(TemporalAdjusters.lastDayOfMonth()));

	}

}
