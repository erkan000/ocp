package chapter5.s1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloRegex {

	public static void main(String[] args) {	
		
		//regex("I am fine to dine at nine", "[fdn]ine");
		//regex("1 2 4 The new 55 Programmer 44 exam", "[\\sA-Za-z]+");
		//regex("1 2 4 The new 55 Programmer 44 exam", "[\\s]+");
		regex("ThisIsIt,finalString,NoBugsProjest", "[^\\w*]");
		//regex("ThisIsIt,finalString,NoBugsProjest", "\\w+");

		
		//String replacedStr = matcher.replaceAll("YENİ");
		//System.out.println(replacedStr);
	}
	
	public static void regex(String targetString, String regex){
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

