package date.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Format {

	public static void main(String[] args) {		
		
		LocalDate date = LocalDate.of(2021, Month.APRIL, 25);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		
		System.out.println("---");
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());

		System.out.println("---");
		
		LocalDate another = LocalDate.parse("2021-04-12");
		System.out.println(another);
		
		System.out.println("---");
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		System.out.println("---");
		
		String formatlanmis = DateTimeFormatter.BASIC_ISO_DATE.format(date);
		System.out.println(formatlanmis);
		
		var f = DateTimeFormatter.ofPattern(" 'time is:' h:mm");
		System.out.println(time.format(f));
		
		var f2 = DateTimeFormatter.ofPattern(" 'time is:' hh:mm").withLocale(Locale.KOREAN);
		System.out.println(time.format(f2));
		

	}

}
