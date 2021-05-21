package sinavsorulari;

public class Soru4 {
	
	static void method1() throws BB{
		throw new BB();
	}

	public static void main(String args[ ] ){
		
		try {
			method1();
//		} catch (Exception | BB e) {  BB zaten yakalandı hatası verir, compile olmaz!
		} catch (Exception e) {
			
		}
		
	}

}

class BB extends RuntimeException{}
