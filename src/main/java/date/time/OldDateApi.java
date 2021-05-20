package date.time;

import java.util.Calendar;
import java.util.Date;

public class OldDateApi {

	public static void main(String[] args) {
		Date now = new Date();				// just now
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();		// just now!
		cal.set(1994, 0 , 31);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.YEAR, 5);
		System.out.println(cal.getTime());
	}

}
