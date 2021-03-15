package chapter4.s7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("1");
		hashSet.add("2");
		// Aşağıdaki satır set içinde aynı elemanlar olduğu için çalışmaz.
		boolean eklendiMi = hashSet.addAll(hashSet);
		// eklenmediği için false döndürür.
		System.out.println("Eklenme durumu= " + eklendiMi);
		hashSet.add(null);

		boolean icindeMi = hashSet.contains(null);
		System.out.println("İçinde mi= " + icindeMi);
		
		//Bütün elemanlar aynı sayıda ve eşit olursa ancak true dönüyor.
		HashSet<String> aranan = new HashSet<String>();
		aranan.add("1");
		boolean esitMi = hashSet.equals(aranan);
		System.out.println("Eşit mi= " + esitMi);
		
		if(hashSet.isEmpty()){
			hashSet.clear();		// Bütün listeyi siler. void döner.
			boolean sildiMi = hashSet.remove(null);
			
		}
		ArrayList<String> sil = new ArrayList<>();
		sil.add("1");
		//hashSet.removeAll(sil);		// sil koleksiyonu içindekileri siler.
		//hashSet.retainAll(sil);		// sil koleksiyonu haricindekileri siler.
		
		for (Iterator<String> iterator = hashSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("Bitti");	

		Object[] dizi = hashSet.toArray();

	}

}
