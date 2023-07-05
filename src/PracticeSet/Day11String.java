package PracticeSet;



public class Day11String {
	public static void main(String[]args) {
		
		
		String s="velocity";
		String s1="Krushna";
		String s2="Rupali";
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println("====================");
		
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println("======================");
		
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		System.out.println("====================");
		
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		
		System.out.println("====================");
		
		
		System.out.println(s.charAt(3));
		System.out.println(s1.charAt(3));
		System.out.println(s2.charAt(3));
		
		System.out.println("====================");
		
		// comparison of string
		
		System.out.println(s.equals(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s));
	
		System.out.println("====================");
		
		System.out.println(s.contains(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s));
		
	
	}

}
