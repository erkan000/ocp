package chapter5.s2;

public class StringSearch {

	public static void main(String[] args) {
		String sentence = "paint the cup and the plate";
		
		System.out.println(sentence.indexOf('t'));
		System.out.println(sentence.lastIndexOf('t', 15));
		System.out.println(sentence.indexOf("the"));
		System.out.println(sentence.indexOf('t', 15));
		System.out.println(sentence.lastIndexOf("the"));
		System.out.println(sentence.lastIndexOf('t'));

		StringBuilder sb = new StringBuilder("ee");
		boolean varMi = sentence.contains(sb);
		
		String ara = sentence.substring(0, 3);
		System.out.println("Aranan = " + ara);
		
		int limit;
		String[] tokens = sentence.split(" ");
		for (String string : tokens) {
			System.out.println(string);
		}
	}

}
