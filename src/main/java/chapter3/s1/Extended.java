package chapter3.s1;

public class Extended implements Arayuz{
	
	int number = 20;
	
	
	public static void main(String[] args) {
		Extended e = new Extended();
		System.out.println(e.number);
		System.out.println(Arayuz.number);
	}

}
