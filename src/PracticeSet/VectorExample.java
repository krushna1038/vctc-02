package PracticeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		Vector vec=new Vector();
		vec.add(10);
		vec.add("krushan");
		vec.add("Rupali");
		vec.add(50000);
		vec.add(7);
		vec.add(8);
		
		
		
		System.out.println("before sorting"+vec);
		System.out.println(vec.capacity());
		
		vec.set(3, "xyz");
		System.out.println(vec);
		
		vec.add(6, 2000);
		System.out.println(vec);
		
		vec.add(6,5050);
		System.out.println(vec);
		
		vec.remove(6);
		System.out.println(vec);
		
//	    vec.removeElement(2000);
//	    System.out.println(vec);
	    
	    System.out.println(vec.size());
	
	    vec.add(7,60000);
	    System.out.println(vec);
	    
	    System.out.println(vec.size());
	    
	    System.out.println(vec.isEmpty());
	    
	    System.out.println(vec.lastElement());
	    
	    System.out.println(vec.contains(7));
	    
	    System.out.println(vec.get(5));
	    
	    System.out.println(vec.indexOf(5050));
	    
		
		Iterator itr=vec.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
