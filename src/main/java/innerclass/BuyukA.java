package innerclass;


public class BuyukA {

	public class B {

		public B() { // yapilandirici
			System.out.println("Ben B sinifi ");
		}
	}  // class B


	public BuyukA() {
		System.out.println("Ben BuyukA sinifi ");
	}

	public static void main(String args[]) {
		BuyukA ba = new BuyukA();
	}
}
