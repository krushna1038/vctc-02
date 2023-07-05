package PracticeSet;

public class staticexample {
	
	static int a=20;
	int b=20;
	
	public static void m1() {
		System.out.println("this is static method");
		
	}
    
	public void m2() {
		System.out.println("thsi is non static method");
	}
	
	
	
	public static void main(String[] args) {
		
	// Rule1 : static methods can access member directly
		
		System.out.println(a);
		m1();
		
		// Rule 2: non static method can access both static and non static method through object only
		System.out.println("=======================");
		staticexample s=new staticexample();
		System.out.println(s.b);
		s.m2();
		m1();
		
		// Rule3: Non static method can access both static and non static members directly
		
		staticexample se=new staticexample();
		se.m2();
		m1();
		
		
		
		
		
		
		
	}
}   

