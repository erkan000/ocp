package chapter5.s2;

import java.util.*;

public class StringTokenizerTest{

	private StringTokenizer st ; 
	private String cumle = "Araba yolda bozuldu";

	public StringTokenizerTest() throws Exception {
		st = new StringTokenizer(cumle);
	}

	public void bolumle() throws Exception {
		if (st != null ) {
			while (st.hasMoreElements()) {
				System.out.println("-->  " + st.nextToken());
			}
		}
	}

	public static void main( String args[] ) throws Exception {		
		StringTokenizerTest stob = new StringTokenizerTest();
		stob.bolumle();
	}
}

