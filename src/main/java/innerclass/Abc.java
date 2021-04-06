package innerclass;

public class Abc {

	public Abc() {	// Yapilandirici 
		System.out.println("Abc nesnesi olusturuluyor");
	}

	public class Def {

		public Def() { // Yapilandirici 
			System.out.println("Def nesnesi olusturuluyor");
		}

		public class Ghi {

			public Ghi() {	 // Yapilandirici 
				System.out.println("Ghi nesnesi olusturuluyor");
			}  

		}  // class Ghi    

	}	//class Def    


	public static void main( String args[] ) {
		Abc.Def.Ghi  ici_ice = new Abc().new Def().new Ghi();
	}

}	 // class Abc
