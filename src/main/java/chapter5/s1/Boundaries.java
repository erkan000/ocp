package chapter5.s1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boundaries {

	public static void main(String[] args) {
		String targetString = "the leather in their coat made her seethe.";
		String regex = "\\Bthe";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);
		while (matcher.find()) {
			System.out.println(matcher.group() + " starts at " +
					matcher.start() + ", ends at " +
					matcher.end());
		}
		
		
	}

}

