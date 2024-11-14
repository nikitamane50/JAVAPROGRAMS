package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		
	List<String> al=new ArrayList<String>();
	al.add("C");
	al.add("Core Java");
	al.add("Advance Java");
	
	System.out.println(al);
	/*System.out.println("Initial value"+al);
	
	Collections.addAll(al, "Servlet");
	System.out.println("After adding element"+al);
	System.out.println(Collections.min(al)); */
	
	Collections.sort(al);
	Iterator it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("Reversed Order.........");
	Collections.sort(al,Collections.reverseOrder());
	
	Iterator it1=al.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	
	}
}
