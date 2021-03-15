package chapter4.s7;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();

		// Bunların hepsi içerde addLast fonksiyonunu çağırıyor.
		// addLast ise null eklenince NullPointerException fırlatıyor.
		// Sadece addLast'ın void dönüş tipi var. Diğerleri boolean ve null vermezse true dönüyor hep.
		deque.add("Birinci");	
		deque.addLast("addLast");			// SONA EKLER !
		deque.offer("offer");
		deque.offerLast("offerLast");
		
		// Bunların hepsi içerde addFirst fonksiyonunu çağırıyor.
		// eklenen null ise NullPointerException fırlatıyor.
		// dönüş offerFirst'ün var sadece, diğer ikisi void
		deque.addFirst("En öne eklenen");	// BAŞA EKLER !
		deque.offerFirst("En öne önüne eklenen");
		deque.push("En önün önüne eklenen");
		
		// Bu satır derlenir ama compile time da NullPointerException fırlatır.
		// deque.offerFirst(null);
		
		// Hepsi içerde pollFirst'ü çağırıyor.
		// silinen null ise NoSuchElementException (ilk 3 metodda.)
		// poll ve pollFirst null'a hata vermiyor.
		deque.removeFirst();
		deque.remove();				// BAŞ TARAFTAN SİLER !
		deque.pop();
		deque.poll();
		String bastnSilinen = deque.pollFirst();
		System.out.println("Baştan Silindi!: " + bastnSilinen);
		
		deque.removeLast();			// SON TARAFTAN SİLER !
		String silinen = deque.pollLast();
		System.out.println("Sondan Silindi!: " + silinen);
		
		if(deque.size() == 0){
			deque.offer("1");
			deque.offer("2");
			deque.offer("3");
			deque.offer("4");
		}
		
		deque.getFirst();			// BAŞ TARAFTAKİNİ DÖNDÜRÜR !
		deque.peek();
		deque.peekFirst();
		String ilkEleman = deque.element();
		
		deque.getLast();			// SON TARAFTAKİNİ DÖNDÜRÜR !
		String sonEleman = deque.peekLast();
		System.out.println("Aranan = " + ilkEleman + " ve " + sonEleman );
		
		boolean sonuc = deque.contains("4");
		System.out.println("Aranan: " + sonuc);
		
		boolean sil = deque.remove("1");
		deque.removeFirstOccurrence("");
		System.out.println("Silinen: " + sil);

		for (Iterator<String> iterator = deque.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
	}

}
