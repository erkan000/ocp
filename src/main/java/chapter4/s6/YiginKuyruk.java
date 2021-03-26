package chapter4.s6;

import java.util.LinkedList;
import java.util.Iterator;

public class YiginKuyruk {

	public static void main(String args[]) {
		
		Integer i1 = new Integer(0);
		Integer i2 = new Integer(0);
		Integer i3 = new Integer(2);
		Integer i4 = new Integer(2);	

		LinkedList torba = new LinkedList();
		torba.add(i1);
		torba.add(i2);
		torba.addFirst(i3);
		torba.addLast(i4);
		torba.removeLast();
		torba.removeFirst();		
		
		Iterator iterator = torba.iterator();
		while (iterator.hasNext()) {
		    Integer i = (Integer)iterator.next();
		    System.out.println("-->"  + i);
		}
		
	}
}




