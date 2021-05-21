package sinavsorulari;

import java.util.stream.IntStream;

public class Soru3 {
	
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).mapToObj(s->s + "").forEach(System.out::println);
//		IntStream.rangeClosed(1, 100).mapTo(s->s + "").forEach(System.out::println);
	}

}
