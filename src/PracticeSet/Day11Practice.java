package PracticeSet;

import java.util.Arrays;

public class Day11Practice {
	public static void main(String[] args) {
		
		
		int a[]=new int[8]; 
		a[0]=20;a[3]=40;
		a[1]=10; a[2]=30;
		a[4]=60;
		a[5]=70; a[6]=80;a[7]=80;
		
        int[] values=Arrays.copyOfRange(a, 2, 5);
        System.out.println(Arrays.toString(values));
		
		
		System.out.println(a.length);
		System.out.println(a[4]);
		
		
		
		for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
	}

		
		
		
}}
