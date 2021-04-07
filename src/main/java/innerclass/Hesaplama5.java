package innerclass;

public class Hesaplama5 {
	
	private static int  x = 3 ;

	public static class Toplama5 { // Statik uye dahili sinif  
		static int toplam ;	  // dogru
		int sonuc ;		// dogru
		public  static int toplamaYap(int a, int b) {
			// sonuc = a+b + x ;  // ! Hata !
		         toplam = a + b + x ;
			return toplam    ; 
		}
	}  // class Toplama5

	public static void main(String args[]) {
		int sonuc = Hesaplama5.Toplama5.toplamaYap(16,8);
		System.out.println("Sonuc  =  16 + 8  =  " + sonuc );
	}
} // class Hesaplama5




