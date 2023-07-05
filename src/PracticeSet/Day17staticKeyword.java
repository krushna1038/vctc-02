package PracticeSet;

public class Day17staticKeyword {
	
	
	
	int empid;
	String empname;
	static int dept;
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(dept);
	}
   
	public static void main(String[] args) {
		
		Day17staticKeyword sk=new Day17staticKeyword();
		sk.empid=101;
		sk.empname="krushna";
		dept= 100;
		sk.display();
		
		
		
		
		
		
		
		
	}
}
