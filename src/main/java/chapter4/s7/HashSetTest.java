package chapter4.s7;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {	
	
	public static void main(String[] args) {
		Set<Long> list = new HashSet<>();
		long a = 1L;
		long b = 2L;
		long c = 1L;	// a ile aynı
		System.out.println(list.add(a));
		System.out.println(list.add(b));
		System.out.println(list.add(c));		// Hata fırlatmaz, false döner ve eleman aynı oldugundan eklemez!
		
		System.out.println(list.size());
		
		Set<String> islandNations = Set.of("Australia", "Japan", "Taiwan", "Cyprus", "Cuba");
		System.out.println(islandNations);      // Sırası tamamen rastgeledir! sıralanamaz!
	}
	
}

