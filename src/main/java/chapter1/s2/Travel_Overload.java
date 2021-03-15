package chapter1.s2;

public class Travel_Overload {
	static String bookTicket(Employee val) {
		return "economy class";
	}	
	static String bookTicket(CEO val) {
		return "business class";
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(bookTicket(emp));	
		// Sorun yok. Economy class yazar.
		
		Employee EmpCeo = new CEO();
		Employee EmpEng = new Engineer();
		System.out.println(bookTicket(EmpCeo));
		System.out.println(bookTicket(EmpEng));
		// Bu iki tanımda da Economy Class yazar. Çünkü 
		// Because the type of the reference variable emp is Employee.
		// The overloaded methods are bound at compile time and not runtime.
		// Yani her zaman overladed metodlar compile time da bağlanır. Bu sebepten referans değişkeninin tipine bakarlar.
				
		Engineer eng = new Engineer();
		System.out.println(bookTicket(eng));
		// Engineer Employee nin alt sınıfı olduğu için Employee'nin metodu çağrılır.
		//Economy class yazar.
		
	}
}
