package PracticeSet;

public class Methodhidingmain {

	public static void main(String[]args) {
		
		MrthodHidingExample d= new MrthodHidingExample();
		
		MethodhidingClass2 d1=new MethodhidingClass2();
		
		// upcasting 
		
		MrthodHidingExample d11=new MethodhidingClass2();
		
		d.m1();
		d1.m1();
		d11.m1();
		
		
		// static method
		
		System.out.println("==============================");
		
		d.m2();
		d1.m2();
		d11.m2();
		
		
		
		
		
		
		
	}
	
}
