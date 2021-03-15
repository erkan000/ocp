package chapter4.s9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
		TreeSet<Person> t = new TreeSet<>();
		// Person sınıfı Comparable implement etmiyorsa add hata veriyor.
		// Comparable çok önemli, yaşa göre farkı alıyor ve yaş eşit ise eklemiyor.
		t.add(new Person("erk", 32));
		t.add(new Person("nurd", 31));
		t.add(new Person("arzu", 29));		
		printCollection(t);
		
		TreeSet<Person> t2 = new TreeSet<>(new PersonComparator());
		// Bu örnekte hem Comparable tanımlı person da hem Comparator.
		// Comparator önceliği aldı.
		t2.add(new Person("erk", 32));
		t2.add(new Person("nurd", 31));
		t2.add(new Person("arzu", 29));		
		printCollection(t2);
		
	}
	
	private static void printCollection(Collection<Person> c){
		for (Iterator<Person> iterator = c.iterator(); iterator.hasNext();) {
			Person string = (Person) iterator.next();
			System.out.println(string);
		}
	}

}
