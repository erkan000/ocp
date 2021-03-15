package chapter1.s2;

public class OverloadParameters {
	static double calcAverage(double marks1, int marks2) {
		return(marks1 + marks2)/2;
	}
	static double calcAverage(int marks1, double marks2) {
		return(marks1 + marks2)/2;
	}
	public static void main(String[] args) {
//		calcAverage(2, 3);
//		Compile olmaz, birbiri yerine geçen parametreleri bilemez hangisi olduğunu
	}
}


