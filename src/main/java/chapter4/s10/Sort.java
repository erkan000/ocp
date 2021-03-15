package chapter4.s10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		int dizi[] = { 12, 45 , 6 , 11} ;
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			int j = dizi[i];
			System.out.println(j);
		}
		
		List<String> arr = Arrays.asList("erkan", "ERKANN" , "23");
		Collections.sort(arr);
		Collections.reverse(arr);
		System.out.println(arr.toString());
		
		Collections.sort(arr, new Comparator<String>(){
			public int compare(String p1, String p2) {
				return p1.length()-p2.length();
			}
		}
				);
		// Hiçbir etkisi yok null geçmenin
		Collections.sort(arr, null);
		System.out.println(arr.toString());
		
		System.out.println(Arrays.binarySearch(dizi, 777));
		
	}

}
