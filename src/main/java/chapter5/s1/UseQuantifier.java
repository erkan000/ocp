package chapter5.s1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseQuantifier {

	public static void main(String[] args) {

		String targetString = "bday";
		String regex = ".";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);

		while (matcher.find()) {
			System.out.printf("Found :%s: starts at %d, ends at %d",
					matcher.group(),
					matcher.start(),
					matcher.end());
			System.out.println();
		}

	}
}
