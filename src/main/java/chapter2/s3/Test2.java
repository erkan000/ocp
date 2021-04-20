package chapter2.s3;

public class Test2 {
	public static void main(String[] args) {
		for(Planet p : Planet.values()){
			System.out.println(p.getDistace());
		}
	}
}


enum Planet {
	MERCURY(0.39), VENUS(), EARTH;
	
	private double distanceFromSunAU = 1.0;
	
	private Planet(double distance){
		distanceFromSunAU = distance;
	}
	
	private Planet(){
		distanceFromSunAU = 5.0;
	}
	
	public double getDistace(){
		return distanceFromSunAU;
	}
}