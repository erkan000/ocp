package chapter10.s3;

import java.util.Date;

public class ImmutableClass {

	public static void main(String[] args) {
		BirthDate b = new BirthDate(new Date(24654324l));
		Date degisenTarih = b.getBirthDate();
		System.out.println(degisenTarih);
		
		degisenTarih = new Date(0);
		System.out.println(b.getBirthDate());
	}

}


final class BirthDate {
	private final Date birth;
	public BirthDate(Date dob) {
		birth = dob;
	}
	public Date getBirthDate() {
		return (Date)birth.clone();
	}
	public boolean isOlder(Date other) {
		// calculate 'other' with 'birth'
		// return true is 'birth' < 'other'
		return true;
	}
}
