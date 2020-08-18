package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String s1=" to java ";

		// Length of a string
		System.out.println(s.length());

		//joinning of string
		System.out.println(s.concat(s1));

		// trimning of the string
		s="       Welcome     ";
		System.out.println("Befor triming string is: "+s);

		//Remove space
		System.out.println("After trimning string is: "+s.trim());

		// Contains() --> return true
		System.out.println(s.contains("wel"));

		// Comparing string equals
		s="Welcome";
		System.out.println(s.equals("Welcome")); //true
		System.out.println(s.equals("Wel  come")); //False
		System.out.println(s.equals("welcome")); //false

		//Replacing charactere 
		s="Welcome to java ";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java","selenium"));

		//Extracting substrinf from the main string
		s="Welcome";
		System.out.println(s.substring(0,4)); //welcome

		// Converting case 
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		// to uper case 
		s="welcome";
		System.out.println(s.toUpperCase());





	}

}
