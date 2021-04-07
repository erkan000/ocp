package innerclass;


public class Hesaplama7 {

    public static int topla(int a, final int b) {
        
		int a_yedek = a ;
        
		class Toplama7 {
            private int x ; // dogru
            public int y ;  // dogru
            // protected int z = a_yedek ;  // ! Hata !
            int p ;  // dogru
            public int degerDondur() { 
                // int degera = a ;  // Hata
                int degerb = b ; 
                return b ;
            }

        }   // class Toplama7

        Toplama7  t7 = new Toplama7();
        return t7.degerDondur();
    }

    public  void ekranaBas()  {
        
		/*  yerel siniflar sadece friendly erisim
			belirliyicisine sahip olabilirler 
			
			public  class Toplama8 {
				public void  test() { 
				}
			}  // class Toplama8
        
		*/
    }  // ekranaBas



	public void hesaplamaYap()  {
        
		/*  yerel sini sadece friendly erisim
			belirliyicisine sahip olabilirler 
			
			static class Toplama9 {
				public void abcd() { 
				}
			}  // class Toplama9
        
		*/
    }  // hesaplamaYap



    public static void main(String args[]) {

        int sonuc = Hesaplama7.topla(5,9);
        System.out.println("Sonuc   " + sonuc );
    }
} // class Hesaplama7




