package chapter4.s7;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Birinci");
		lst.add("İkinci");
		lst.add("Ucuncu");
		lst.add(null);
		boolean eklenme = lst.add("Dorduncu");
		
		boolean silinme = lst.remove("Erkan");	//İlk bulduğu nesneyi equals'a göre siliyor.
				
		//lst.add(3, "element");	// Olmayan indexe IndexOutOfBoundsException fırlatıyor.
		
		//lst.addAll(lst);
			
		boolean varMi = lst.contains("İkinci");
		varMi = lst.contains(4l);
		//Object nesne alıyor. Bu yüzden hata vermiyor. İçerde ise indexOf fonksiyonunu çağırıyor
		// indexOf fonksiyonu da equals ile ilgili nesneyi buluyor.
		varMi = lst.contains(null);
		System.out.println("Listede = " + varMi);
		
		// varMi = lst.containsAll(c)
		// c collaksiyonundaki bütün elemanları döner ve bu elemanlardan en az biri yoksa false
		// bütün nesneleri kapsıyor ise true döner.
		
		Object o = lst.get(0);
		String s = lst.get(0);		
		//lst.get("ew");			// Sadece int alır.	
		//lst.get(50);			// Olmayan indexe IndexOutOfBoundsException fırlatıyor.
		
		int pozisyon = lst.indexOf("İkinci");
		pozisyon = lst.indexOf(null);
		pozisyon = lst.indexOf(34L);		// Yok ise -1 döner.
		System.out.println("Listedeki pozisyonu = " + pozisyon);
		
		ArrayList<String> lst2 = new ArrayList<String>();
		lst2.add("İkinci");		
		lst.removeAll(lst2);	// Sadece "ikinci" nesnesini siler.
		//lst.retainAll(lst2);	// Yukardakinin tam tersi. İkinci hariç diğerlerini siler.
		//lst.clear();			// Listeyi boşaltır.
		System.out.println("Liste boş mu = " + lst.isEmpty()); //size sıfır ise;
		
		String setEdilenEski = lst.set(1, "Erk");
		System.out.println("Eski değer = " + setEdilenEski);
		
		lst.size(); //size değişkeni
		
		for (Iterator<String> iterator = lst.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		// listIterator istediğin indexten sonrasındaki elemanları dönebiliyoruz.
		for (Iterator<String> iterator = lst.listIterator(2); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
	}

}
