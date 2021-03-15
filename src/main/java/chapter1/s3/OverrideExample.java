package chapter1.s3;

class Book {
	void issueBook(int days) {
		if (days > 0)
			System.out.println("Book issued");
		else
			System.out.println("Cannot issue for 0 or less days");
	}
}

class CourseBook extends Book {
	boolean onlyForReference;
	CourseBook(boolean val) {
		onlyForReference = val;
	}
	@Override
	void issueBook(int days) {
		if (onlyForReference)
			System.out.println("Reference book");
		else
			if (days < 14)
				super.issueBook(days);
			else
				System.out.println("days >= 14");
	}
}

public class OverrideExample {
	public static void main(String[] args) {
		Book b = new CourseBook(true);
		b.issueBook(100);
		// Burada Book üstünde issueBook çağırıyoruz fakat RUNTİME'da nesnenin sınıfındaki metodu çağırıyor!
		b = new CourseBook(false);
		b.issueBook(100);
		b = new Book();
		b.issueBook(100);
	}
}
