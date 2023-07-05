package PracticeSet;

public class Day11ArrayPractice2 {
	public static void main(String[] args) {
		
		
		
		int[][]a=new int [3][4];
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[0][3]=1000;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		a[1][3]=1200;
		a[2][0]=700;
		a[2][1]=800;
		a[2][2]=900;
		a[2][3]=1400;
		
		
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<=a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		
		
		
	}

}
