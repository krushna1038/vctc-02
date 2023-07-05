package PracticeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistCursor {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		
		al.add(10);
		al.add("abc");
		al.add("krushna");
		System.out.println(al);
		
		
		System.out.println("=============================");
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		
		
//		
//		Iterator ar= al.iterator();
//		
//		while(ar.hasNext()) {
//			System.out.println(ar.next());
//		}
//		
//		
		
		ListIterator li=al.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		Collections.reverse(al);
		System.out.println(al);
		Iterator ar= al.iterator();
		while(ar.hasNext()) {
			System.out.println(ar.next());
		}
	}

}
