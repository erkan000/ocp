package chapter4.s6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Collections {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Collection<String> my = new MyList<String>();

		c.add("Erkan");
		c.add("test");
		
		for (Iterator<String> iterator = c.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("Fin!");
		
	}

}
