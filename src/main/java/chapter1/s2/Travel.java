package chapter1.s2;

class Employee {}

class Engineer extends Employee {}

class CEO extends Employee {}

public class Travel {
	static String bookTicket(Engineer val) {
		return "economy class";
	}	
	static String bookTicket(CEO val) {
		return "business class";
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		//bookTicket(emp);
		
		/** HATA = The method bookTicket(Engineer) in the type Travel is not applicable for the arguments (Employee)	
		 * emp is not a Engineer. Doğal olarak gönderilemez.
		 * BİR SINIFA ALT SINIFININ DEĞİŞKENİ PARAMETRE OLARAK GÖNDERİLEMEZ!!!!
		 */
		
		Employee eng = new Engineer();
		//bookTicket(eng);
		
		/** HATA = The method bookTicket(Engineer) in the type Travel is not applicable for the arguments (Employee)
		 * BİR SINIFA ALT SINIFININ DEĞİŞKENİ PARAMETRE OLARAK GÖNDERİLEMEZ.
		 * YUKARDAKİ SATIRLA BİRLEŞTİRİR İSEK METODLAR OBJECT PARAMETRELERİ, REFERANS DEĞİŞKENİNİN TİPİ İLE KABUL EDİYORLAR!!!
		 */
		
		CEO CEO = new CEO();
		System.out.println(bookTicket(CEO));
		
		/** 
		 * Overloading yaparak hangi nesne türünden yarattıysak o nesnenin metodu çalıştı.
		 */
		
	}
}
