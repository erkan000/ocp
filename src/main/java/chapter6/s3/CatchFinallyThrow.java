package chapter6.s3;

import java.io.IOException;

public class CatchFinallyThrow {
	public static void main(String[] args) throws IOException {
		
		try {
			System.out.println("ok");
			throw new Exception();
		}catch (Exception e) {
			throw new IOException();
		}finally {
			throw new NullPointerException();
		}
	}

}

