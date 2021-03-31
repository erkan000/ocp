package chapter7.s4;

import java.io.*;

public class OutputStreamWriterTest {

	private char[] cbuf = { 'M','A','�'};
	private OutputStreamWriter yazici ;
	private BufferedReader okuyucu;


	public void tekTekyaz() throws IOException{
		yazici = new OutputStreamWriter(new FileOutputStream("osw.txt"),"ISO8859-9" );


		for(int i=0 ;i<cbuf.length ;i++ ) {
			yazici.write( cbuf[i] );
		}
		yazici.close();
	}

	public void oku() throws IOException {
		okuyucu = new BufferedReader(
				new InputStreamReader(new FileInputStream("osw.txt"),"ISO8859-9") );

		String okunan = okuyucu.readLine();
		while(okunan !=null) {
			System.out.println(okunan);
			okunan = okuyucu.readLine();
		}
		okuyucu.close();
	}

	public static void main(String[] args) throws IOException{
		OutputStreamWriterTest oswo = new OutputStreamWriterTest();
		System.out.println("Tek tek yaziyor");
		oswo.tekTekyaz();
		oswo.oku();
	}
}

