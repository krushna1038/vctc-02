package PracticeSet;

public class Day18Constructor {
	int a;
	String str;

	Day18Constructor (){
		System.out.println("The is zero arg8mrnt constructor");
		a=10;
		str="Velocity";
	}
    
	Day18Constructor (int c,String d){
		System.out.println("This is with argument constructor");
		a=c;
		str=d;
		
	}
	Day18Constructor (String d,int c){
		System.out.println("This is with argument constructor");
		a=c;
		str=d;
		
	}
	public void display() {
		System.out.println(a);
		System.out.println(str);
		
		
	}
}
