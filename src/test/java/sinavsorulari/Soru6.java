package sinavsorulari;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListSelectionEvent;

public class Soru6 {
	
	static Map<String,String> map = new HashMap<String, String>(); 
	
	static List<String> keys = List.of("A","B");
	
	static List<String> values = List.of("Abb","Bnnn");
	
	static {
		int i=0;
		for (String aa : keys) {
			map.put(keys.get(i), values.get(i));
			i++;
		}
	}
	
	public static void main(String[] args) {
		keys.clear();
		System.out.println(map);
	}

}
