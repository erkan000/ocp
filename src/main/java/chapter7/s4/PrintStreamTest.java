package chapter7.s4;

import java.io.* ;

public class PrintStreamTest {

	private static String[] stringDizisi = { "KOCAELI", "SAKARYA", "BURSA"};

	private static double[] doubleDizisi = { 10.2, 11.8, 13.1} ;

	private static int[] intDizisi = { 2, 3, 4} ;

	public static void main(String args[]) throws IOException {

		FileOutputStream fos = new FileOutputStream( "src/main/resources/files/sil.txt" );
		PrintStream ps = new PrintStream(fos);

		for(int i=0; i<3; i++) {
			ps.print(stringDizisi[i]);
			ps.print("-");
			ps.print(doubleDizisi[i]);
			ps.print("-");
			ps.print(intDizisi[i]);
			ps.println();
			
			boolean kontrol = ps.checkError();
			if(kontrol) {
				throw new IOException("Hata var...");
			} 
		} 
		
		ps.close();
	}
}
