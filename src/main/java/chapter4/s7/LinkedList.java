package chapter4.s7;

import java.util.ArrayDeque;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> linked = new java.util.LinkedList<String>();

		// Bunların hepsi içerde linkLast fonksiyonunu çağırıyor.
		// addLast ise null eklenince NullPointerException fırlatıyor.
		// Sadece addLast'ın void dönüş tipi var. Diğerleri boolean ve null vermezse true dönüyor hep.
		linked.add("Birinci");	
		linked.addLast("addLast");			// SONA EKLER !
		linked.offer("offer");
		linked.offerLast("offerLast");
		
		// Bunların hepsi içerde linkFirst fonksiyonunu çağırıyor.
		// eklenen null ise NullPointerException fırlatıyor.
		// dönüş offerFirst'ün var sadece, diğer ikisi void
		linked.addFirst("En öne eklenen");	// BAŞA EKLER !
		linked.offerFirst("En öne önüne eklenen");
		linked.push("En önün önüne eklenen");
		
		// Bu satır derlenir ama compile time da NullPointerException fırlatır.
		// deque.offerFirst(null);
		
		// Hepsi içerde pollFirst'ü çağırıyor.
		// silinen null ise NoSuchElementException (ilk 3 metodda.)
		// poll ve pollFirst null'a hata vermiyor.
		linked.removeFirst();
		linked.remove();				// BAŞ TARAFTAN SİLER !
		linked.pop();
		linked.poll();
		String bastnSilinen = linked.pollFirst();
		System.out.println("Baştan Silindi!: " + bastnSilinen);
		
		linked.removeLast();			// SON TARAFTAN SİLER !
		String silinen = linked.pollLast();
		System.out.println("Sondan Silindi!: " + silinen);
		
		if(linked.size() == 0){
			linked.offer("1");
			linked.offer("2");
			linked.offer("3");
			linked.offer("4");
		}
		
		linked.getFirst();			// BAŞ TARAFTAKİNİ DÖNDÜRÜR !
		linked.peek();
		linked.peekFirst();
		String ilkEleman = linked.element();
		
		linked.getLast();			// SON TARAFTAKİNİ DÖNDÜRÜR !
		String sonEleman = linked.peekLast();
		System.out.println("Aranan = " + ilkEleman + " ve " + sonEleman );
		
		boolean sonuc = linked.contains("4");
		System.out.println("Aranan: " + sonuc);
		
		boolean sil = linked.remove("1");
		linked.removeFirstOccurrence("");
		System.out.println("Silinen: " + sil);

		for (Iterator<String> iterator = linked.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		
	}

}
