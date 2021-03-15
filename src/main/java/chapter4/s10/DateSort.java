package chapter4.s10;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateSort {

	public static void main(String[] args) {
		
		List<Date> arr = Arrays.asList(
				Date.valueOf("2017-06-14"),
				Date.valueOf("2016-12-04"),
				Date.valueOf("2018-02-22"),
				Date.valueOf("2013-11-13"),
				Date.valueOf("2017-06-15"));
		
		Collections.sort(arr);
		
		for(int i = 0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
		System.out.println(arr.contains(Date.valueOf("2017-06-14")));		
		
	}

}
