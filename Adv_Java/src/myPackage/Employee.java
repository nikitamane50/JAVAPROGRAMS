package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import myPackage.AgeComaprator.NameComparator;

//Comparator interface
public class Employee {

	int id;
	String name;
	int age;
	
	//para constructor
	public Employee(int id,String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		ArrayList<Employee>  w=new ArrayList<Employee>();
		w.add(new Employee(101, "Rohan", 23));
		w.add(new Employee(106, "Nikia", 27));
		w.add(new Employee(106, "Rohit", 21));
		System.out.println("Sorting by name");
		//Collections.sort(w, new NameComparator());
		Iterator  it=w.iterator();
		while(it.hasNext()) {
			Employee r=(Employee)it.next();
			System.out.println(r.id+" "+r.name+" "+r.age);
		}
		System.out.println("Sorting by Age...............");
		
		Collections.sort(w,new AgeComaprator());
		Iterator  it1=w.iterator();
		while(it1.hasNext()) {
			Employee r=(Employee)it1.next();
			System.out.println(r.id+" "+r.name+" "+r.age);
		}
	}
}
	class AgeComaprator implements Comparator<Employee>{
			@Override
			public int compare(Employee o1,Employee o2) {
				if(o1.age==o2.age)
					return 0;
				else if (o1.age>o2.age) 
					return 1;
				else 
					return -1;
				
			}

			class NameComparator implements Comparator<Employee>{
				@Override
				public int compare(Employee o1,Employee o2) {
					Employee e1=(Employee)o1;
					Employee e2=(Employee)o1;

					return e1.name.compareTo(e2.name);
				
				}
			}
	}


