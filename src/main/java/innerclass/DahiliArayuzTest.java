package innerclass;
interface ArayuzA {

	public interface DahiliArayuz1 {
		public void isYap1() ;
	}

	/* //  ! Hata ! 
    protected interface DahiliArayuz2 {
	public void isYap2() ;
    }
	 */
	interface DahiliArayuz3 {
		public void isYap3() ;
	}

	/* //  ! Hata ! 
    private interface DahiliArayuz4 {
	public void isYap4() ;
    }
	 */
}


class Erisim1  implements  ArayuzA.DahiliArayuz1 {
	public void isYap1() {
		System.out.println("Erisim1.isYap1()");
	}
}

class Erisim2  implements  ArayuzA.DahiliArayuz3 {
	public void isYap3() {
		System.out.println("Erisim1.isYap3()");
	}
}

public class DahiliArayuzTest {

	public static void main(String args[]) {
		Erisim1 e1 = new Erisim1();
		Erisim2 e2 = new Erisim2();
		e1.isYap1();
		e2.isYap3();

	} 
}
