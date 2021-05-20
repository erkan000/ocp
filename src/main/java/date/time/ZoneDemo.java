package date.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDemo {
	public static void main(String[] args) {
		Set<String> allZonesIds = ZoneId.getAvailableZoneIds();

		ZoneId ukTZ = ZoneId.of("Europe/London");

		ZonedDateTime currentMeeting=
				ZonedDateTime.of(
						LocalDate.of(2014, Month.MARCH, 12), // LocalDate
						LocalTime.of(9, 30), // LocalTime
						ZoneId.of("Europe/London"))
				;

		ZonedDateTime nextMeeting =
				currentMeeting.plus(Period.ofMonths(1));

		ZonedDateTime nextMeetingUS =
				nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));
		
		System.out.println(allZonesIds);
	}
}
