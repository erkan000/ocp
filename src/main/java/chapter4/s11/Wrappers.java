package chapter4.s11;

public class Wrappers {

	public static void main(String[] args) {
		double dbl = Double.parseDouble("12.3D");
		System.out.println(dbl);
		
		Double d = Double.valueOf(dbl);
		
		dbl = d.doubleValue();
		
		long parse = Long.parseLong("3454");
		System.out.println(parse);
		
		Short s1 = Short.valueOf((short) 1);
		Short s2 = Short.parseShort("1");
		
		Double toplam = d + 12.4;
		System.out.println(toplam);
	}

}
