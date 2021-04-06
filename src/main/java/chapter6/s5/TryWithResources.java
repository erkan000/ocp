package chapter6.s5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		try(FileReader f = new FileReader("")){
			
		}
		
		
		// sadece try-with-resources catch bloksuz olabilir!
		
		
		try {
			
		} catch (Exception e) {
			
		}
	}

}
