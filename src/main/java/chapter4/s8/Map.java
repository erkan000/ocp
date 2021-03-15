package chapter4.s8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		// Generics ler primitive olamaz mı! bak!!!
		//HashMap<int, String> map = new HashMap<>();
		
		HashMap<String, String> map = new HashMap<>();
		String eklenen = map.put("1", "erkan");
		System.out.println(eklenen);
		// eklenen her zaman null dönüyor!
		
		// Aynı değer eklenince value değerini güncelliyor.
		map.put("1", "nurdan");
		
		map.put("2", null);
		map.put(null, "test");
		map.put(null, "null");
		
		map.clear();
		map.put("1", "nurdan");
		map.put("2", "arzu");
		map.put("3", "erkan");
		
		// GET Bulamaz ise null döndürür. Bulur ise değeri döndürür.
		String get = map.get("1");
		map.get(null);
		System.out.println("Get ile alınan deger = " + get);
		
		boolean keyVarmi = map.containsKey(1);
		System.out.println("Aranan key = " + keyVarmi);
		
		Set<String> keyler = map.keySet();
		printCollection(keyler);
		
		Collection<String> degerler = map.values();
		printCollection(degerler);
		
		Set<java.util.Map.Entry<String, String>> entry = map.entrySet();
		for (Iterator<Entry<String, String>> iterator = entry.iterator(); iterator.hasNext();) {
			Entry<String, String> entry2 = (Entry<String, String>) iterator.next();
			System.out.println(entry2.getKey() + "--" + entry2.getValue());
		}
		
		System.out.println(map.toString());
		
		//Map in value'ları nesne olduğunu düşünelim. bu value 'lara
		// nesne eklenince ana map'deki nesne değeri de otomatikman güncelleniyor,
		// işyerinde mesaj işindeki örnek mesela
		
	}
	
	private static void printCollection(Collection<String> c){
		for (Iterator<String> iterator = c.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
