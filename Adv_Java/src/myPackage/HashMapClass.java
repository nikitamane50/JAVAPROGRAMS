package myPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		//s.put(10, "Mango");
		s.put(null, "mango");
		s.put(20,"Apple");
		s.put(30, "Grapes");
		s.put(10, "Banana"); //o|p is banana key is present and it replace value with new value i.e mango is rplaced with banana
		System.out.println(s);
		
		for(Map.Entry m:s.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		

	}

}
