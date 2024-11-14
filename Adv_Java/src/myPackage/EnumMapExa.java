package myPackage;

import java.util.EnumMap;
import java.util.Map.Entry;

enum day{		
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public class EnumMapExa {
	

	public static void main(String[] args) {
		EnumMap<day,String> map=new EnumMap<day,String>(day.class);
		map.put(day.Monday,"1");
		map.put(day.Tuesday,"2");

		for(Entry m:map.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
}
}