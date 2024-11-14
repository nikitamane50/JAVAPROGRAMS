package myPackage;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht=new Hashtable<String,Integer>();
		ht.put("A", 101);
		ht.put("B", 102);
		ht.put("C", 103);
		ht.put("D", 104);
		System.out.println(ht);
		
		for(Map.Entry y:ht.entrySet()) {
			System.out.println(y.getKey()+" "+y.getValue());
		}
	}

}
