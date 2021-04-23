package chapter4.s9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class LambdaCompare {
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("erk", 29));
		list.add(new Person("nurd", 31));
		list.add(new Person("hasan", 3));
		list.add(new Person("arzu", 32));
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("ByName:");
		Comparator<Person> byName = Comparator.comparing(Person::getName);
		Collections.sort(list,byName);
		list.forEach(System.out::println);
		
		System.out.println("natural:");
		Comparator<Person> natural = Comparator.naturalOrder();
		Collections.sort(list,natural);
		list.forEach(System.out::println);
		
		System.out.println("by comparingInt:");
		ToIntFunction<Person> keyExtractor = s -> s.getName().length();
		Comparator<Person> cInt = Comparator.comparingInt(keyExtractor);
		Collections.sort(list,cInt);
		list.forEach(System.out::println);
		
		System.out.println("by comparingInt2:");
		Comparator<Person> cInt2 = Comparator.comparing(Person::getName).thenComparingInt(keyExtractor);
		Collections.sort(list,cInt2);
		list.forEach(System.out::println);
		
//		System.out.println(Collections.binarySearch(list, new Person("erk", 1)));
		
	}

}
