package chapter4.s7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<String>();

		tr.add("erkan");
		tr.add("arzu");
		// Aşağıdaki satır runtime da nullpointer fırlatır!
		// tr.add(null);
		// tr.contains(null);
		// tr.remove(null);
		
		
		HashSet<String> aranan = new HashSet<String>();
		aranan.add("1");
		boolean eklendiMi = tr.addAll(aranan);
		System.out.println("Eşit mi= " + eklendiMi);
		
		ArrayList<String> sil = new ArrayList<>();
		sil.add("1");
		//hashSet.removeAll(sil);		// sil koleksiyonu içindekileri siler.
		//hashSet.retainAll(sil);		// sil koleksiyonu haricindekileri siler.
		
		String sonDeger = tr.last();

		System.out.println(sonDeger);
		
		printCollection(tr);			

	}
	
	private static void printCollection(Collection<String> c){
		for (Iterator<String> iterator = c.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
