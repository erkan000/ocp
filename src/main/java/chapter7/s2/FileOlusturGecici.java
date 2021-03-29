package chapter7.s2;

import java.io.*;

import chapter7.s1.FileHelloWorld;

public class FileOlusturGecici {

    public static void main(String[] args) throws IOException {
	
    String geciciKlasor = FileHelloWorld.yol;
	String ayirac = File.separator ;
	File dosya = File.createTempFile(geciciKlasor ,"tmp" );
//	fakat gerçek bir temp klasötrüne ihtiyaç duyar! içine bakıp incelemek için
//	File dosya = File.createTempFile(geciciKlasor ,"tmp" , new File(geciciKlasor));  
	dosya.deleteOnExit();

	PrintWriter  yazici = new PrintWriter (new FileWriter(dosya)) ; 
        yazici.println("Merhabalar");
	yazici.close();
	
	
	// gecici dosyadan verileri okuyoruz.
	BufferedReader okuyucu = new BufferedReader( new FileReader(dosya));
	String okunan = okuyucu.readLine();
	while(okunan != null) {
	    System.out.println(okunan);
	    okunan = okuyucu.readLine(); 
	}

	okuyucu.close();
    } 
}
