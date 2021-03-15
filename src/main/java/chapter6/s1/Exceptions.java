package chapter6.s1;

import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException{
		// Bu metodda ise FileNotFoundException tanımlanmasına rağmen aşağıda Exception
		// sınıfından bir hata fırlatılıyor.
		// Bu özellik MORE-INCLUSIVE TYPE CHECKING 'dir.
		try {
			throw new FileNotFoundException("bulunamadı");
		} catch (Exception e) {
			System.out.println("Exception sınıfı toString metodu = " + e + "---");
			throw e;
		}

	}
	
	// Bu metodda try checked Exception fırlatmıyor ise catch blogu hata verir, Derlenmez!
	void method10() {
		//try {}
		//catch (FileNotFoundException e) {}		
	}
	void method6() {
		try {}
		catch (Error e) {}
	}
	void method7() {
		try {}
		catch (Exception e) {}
	}
	void method8() {
		try {}
		catch (Throwable e) {}
	}
	void method9() {
		try {}
		catch (RuntimeException e) {}
	}
	

}
