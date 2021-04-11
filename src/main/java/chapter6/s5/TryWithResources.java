package chapter6.s5;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws IOException{
		try(FileReader f = new FileReader("")){

		}		

		// sadece try-with-resources catch bloksuz olabilir!		

		try(FileReader f = new FileReader("") ; 
				FileReader f2 = new FileReader("")){

		}
		
		var a1 = new FileReader("");      // effectively  final
		final var a2 = new FileReader("");
		try(a1;a2){
			
		}
	}

}
