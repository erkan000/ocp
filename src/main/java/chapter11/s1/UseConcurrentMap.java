package chapter11.s1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// BU ÖRNEKTE AŞAĞIDAKİ manipulateMap SINIFI KENDİ BAŞINA THREAD-SAFE GÖRÜNÜYOR.
// FAKAT AŞAĞIDA YAZILMAYAN POPULATE MAP METODU İLE DÜŞÜNÜRSEK,
// MULTI-THREADED ORTAMLARDA THREAD-SAFE DEĞİLDİR!!!

// ÇÖZMEK İÇİN İKİ SATIRIN İŞLEVİNİ GÖRE ATOMİK ŞU METOD YAZILMIŞTIR. 
// map.replace(key, value);
// BU ŞEKİLDE PROGRAMIMIZ THREAD-SAFE OLUR.


public class UseConcurrentMap {
	static final ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();
	static {
		//code to populate map
	}
	static void manipulateMap(Integer key, String value) {
		// complex computations
		if(!map.containsKey(key))
			map.put(key, value);
	}
}
