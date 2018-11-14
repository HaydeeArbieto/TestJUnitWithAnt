package se.hada.parameterized;

public class Main {

	public static void main(String[] args) {
		
		PrimeNumberChecker pn = new PrimeNumberChecker();
		
		System.out.println("2 " + pn.validate(2));
		System.out.println("6 " + pn.validate(6));
		System.out.println("19 " + pn.validate(19));
		System.out.println("22 " +pn.validate(22));
		System.out.println("23 " + pn.validate(23));
		
	}

}
