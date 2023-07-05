package PracticeSet;

public class Calculation {
	
	int x=200;
	int y=100;
	// Case 1 :  method will not accepting parameter and not returning any value
//	public void sum() {
//		System.out.println(x+y);
//	}
//	   
	// Case 2 method will accept parameter but retuning value
	
//	public int sum() {
//		return x+y;
//	}
	
	// Case 3 : method will accept parameter but not return value
//	public void sum(int x, int y) {
//		System.out.println(x+y);
//	}
	
	
	// Case 4 : method will  accepet parametr and return value
	
	public int sum(int x,int y) {
		return x+y;
	}
	
public static void main(String[] args) {
	
//	Case1 
//	Calculation c=new Calculation();
//	
//	c.sum();
	
 // case 2
//    Calculation c=new Calculation();
//   int Output= c.sum();
//   System.out.println(c.sum());
	
	
	
	
	// case 3 
//	Calculation c=new Calculation();
//	c.sum(100, 200);
//	c.sum(10, 20);
//	c.sum(7811223, 78512333);
//	
	 // Case 4
	Calculation c= new Calculation();

	System.out.println(c.sum(200, 400));
	
	}
}





