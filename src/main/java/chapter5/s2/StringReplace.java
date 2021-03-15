package chapter5.s2;

public class StringReplace {

	public static void main(String[] args) {
		String str = "cat cup copp";
		String newString = str.replaceAll("c.p\\b", "()"); //line4
		System.out.println(newString);
		
		newString = str.replaceFirst("c.p\\b", "()");
		System.out.println(newString);
		
		newString = str.replace("c.p", "()");
		System.out.println(newString);
		
		newString = str.replace(new StringBuilder("cat"), "()");
		System.out.println(newString);
		
		
		String start = "Start startup, time to start";
		
		System.out.println(start.startsWith("Start"));
		System.out.println(start.startsWith("Start", 0));
		System.out.println(start.startsWith("Start", -1));
		System.out.println(start.startsWith("Start", 1));

	}

}
