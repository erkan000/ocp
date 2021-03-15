package chapter4.s2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildcardBoundedLower {

	public static void main(String[] args) {
		
		List<? super Gift> myList1 = new ArrayList<Gift>();
		List<? super Gift> myList2 = new ArrayList<Object>();
		List<? super Phone> myList4 = new ArrayList<Gift>();
		List<?> myList5 = new ArrayList<Gift>();
		List<?> myList6 = new ArrayList<Object>();
		List<? super String> myList7 = new ArrayList<String>();
		List<? super String> myList8 = new ArrayList<Object>();
		
		// Ağapıdaki örnekte ise bu list sadece super'i gift olan sınıfları alabilir
		//		List<? super Gift> myList3 = new ArrayList<Phone>();
		
		wrapGift(myList1); //sınıfın kendisi pass edilebilir.
		wrapGift(myList2); //sınıfın super ları pass edilebilir.

		// Aşağıdaki 4 örnek ise WONT COMPILE!
		// Çünkü wrapGift metodu sadece Gift sınıfı superi olan sınıfları kabul eder.
		//wrapGift(myList5);
		//wrapGift(myList6);
		//wrapGift(myList7);
		//wrapGift(myList8);
		
		List<? super Gift> list = new ArrayList<Gift>();
		list.add(new Gift());
		list.add(new Book());
		list.add(new Phone());
		
		/**
		 * Yukarıdaki nesnelerin tümü eklenebilir ama
		 * aşağıdaki object tipindeki nesne eklenemez!
		 */
		
		//list.add(new Object());
		for (Object obj : list) 
			System.out.println(obj);		
	}
	
	public static void wrapGift(List<? super Gift> list) {
		for (Object item : list) {
			System.out.println("GiftWrap - " + item);
		}

		/**
		 * Değişkenin tipi Gift olamaz. WONT COMPILE
		 * 
		 * 		for (Gift item : list) {
					System.out.println("GiftWrap - " + item);
				}
		 */
	}	
}
