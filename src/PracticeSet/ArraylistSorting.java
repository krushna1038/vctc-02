package PracticeSet;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
	public static void main(String[] args) {
		
		// sorting of array
		
		ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Tata");
		cars.add("Audi");
		cars.add("Maruti");
		cars.add("BMW");
		cars.add(" ");
		
		// list of cars befor sorting
		
		System.out.println("Before Sorting" + cars);
		
		Collections.sort(cars);
		System.out.println("After sorting"+ cars);
		
		
		Collections.sort(cars, Collections.reverseOrder());
		System.out.println("After sorting in descending order"+cars);
		
		
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(70);
		num.add(40);
		num.add(50);
		num.add(50);
		num.add(0);
		num.add(0);
		
		
		System.out.println("Before sorting"+num);
		
		Collections.sort(num);
		System.out.println("After Sorting"+ num);
		
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("After sorting Descending order"+num);
		
		
		
		
		
		
		
		
	}
	

}
