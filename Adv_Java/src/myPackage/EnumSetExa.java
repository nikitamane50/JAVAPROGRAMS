package myPackage;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{		//same as abstract class but we use enum
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public class EnumSetExa {

	public static void main(String[] args) {
		//Set<days> set=EnumSet.of(days.Monday,days.Thursday);
		Set<days> set=EnumSet.allOf(days.class);
		Iterator<days> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
