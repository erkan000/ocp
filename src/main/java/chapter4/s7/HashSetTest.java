package chapter4.s7;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {	
	
	public static void main(String[] args) {
		Set<Long> takipNoList = new HashSet<>();
		long a = 1L;
		long b = 2L;
		long c = 1L;	// a ile aynı
		System.out.println(takipNoList.add(a));
		System.out.println(takipNoList.add(b));
		System.out.println(takipNoList.add(c));		// Hata fırlatmaz, false döner ve eleman aynı oldugundan eklemez!
		
		System.out.println(takipNoList.size());
	}
	
}

