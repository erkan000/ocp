package chapter4.s6;

import java.util.*;
import java.util.Collections;

public class Senkronizasyon  {
  public static void main(String[] args) {		
		
    
    Collection c = Collections.synchronizedCollection(new ArrayList());
    
    List list = Collections.synchronizedList(new ArrayList());
    List list2 = Collections.synchronizedList(new LinkedList());

    Set s = Collections.synchronizedSet(new HashSet());
    Set sSirali = Collections.synchronizedSortedSet(new TreeSet());
    
    Map m = Collections.synchronizedMap(new HashMap());

    Map mSirali = Collections.synchronizedSortedMap(new TreeMap());
    
    Set treeSet = Collections.synchronizedNavigableSet(new TreeSet());
    Map treeMap = Collections.synchronizedNavigableMap(new TreeMap());
    
    Collection kapaliTorba = Collections.unmodifiableCollection(c);

	// calisma aninan istisna olusmasina sebebiyet verecektir.
	kapaliTorba.add(new Integer(69));
	
	
  }
} 
