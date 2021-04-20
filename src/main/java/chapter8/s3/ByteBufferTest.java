package chapter8.s3;

import java.nio.*;

public class ByteBufferTest {
	
	/**
	 * 
	 * 
- hasRemaining() yordamı, mevcut pozisyon ile limit arasındaki eleman sayısını bildirir.
- flip() yordamı çağrıldığında, ByteBuffer nesnesinde tanımlı olan pozisyonun değeri sıfıra eşitlenir. Limit değeri okunamayacak veya yazılamayacak olan son elemanın üzerine getirilir ve biraz ileride göreceğimiz
- mark() yordamının kullanılmasıyla işaretlenmiş olan yer silinir.
- get() yordamı, belirtilen elemanı okur.
	 * 
	 * 
	 */

	public static void main(String args[]) {

		ByteBuffer bb =  ByteBuffer.allocate(10);
		bb.put( (byte)'a' );
		bb.put( (byte)'b' );
		bb.put( (byte)'c' );
		bb.putInt(5);

		int kapasite = bb.capacity();
		int limit = bb.limit();
		int pozisyon = bb.position();

		System.out.println(" kapasite:"+kapasite);
		System.out.println(" limit:"+limit);
		System.out.println(" pozisyon:"+pozisyon);
		System.out.println("-------flip()--------------");

		bb.flip(); // onemli 

		kapasite = bb.capacity();
		limit = bb.limit();
		pozisyon = bb.position();

		System.out.println(" kapasite:"+kapasite);
		System.out.println(" limit:"+limit);
		System.out.println(" pozisyon:"+pozisyon);
		System.out.println("---------------------------");

		while (bb.hasRemaining()) {			
			System.out.println( "-->" + bb.get() );
			System.out.println("Remains: " + bb.remaining());
		}
	}
}
