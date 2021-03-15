package chapter12.s3;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.APRIL, 15);
		// aşağıdaki satır yanlışlığa sebebiyet verir.
		cal.set(2017, 4, 15);
		Date now = cal.getTime();
		System.out.println(now);
		
		System.out.println(now.getTime());

	}

}
