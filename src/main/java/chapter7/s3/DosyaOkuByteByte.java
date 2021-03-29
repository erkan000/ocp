package chapter7.s3;

import java.io.*;
public class DosyaOkuByteByte {

	public static void main(String args[]) {
		
		try {
			InputStream is = new FileInputStream("src/main/resources/files/file1.txt"); //Dikkat
			byte[] bDizi = new byte[100];
			int okunanByteSayisi ;
			while( (okunanByteSayisi = is.read(bDizi)) != -1 ) {
				for(int i=0; i<okunanByteSayisi; i++) {
					System.out.println(bDizi[i] + "\t-\t" + (char)bDizi[i] );
				}

			}
			is.close();

		} catch(IOException e) {
			System.err.println(e);
		}
	} 
}

