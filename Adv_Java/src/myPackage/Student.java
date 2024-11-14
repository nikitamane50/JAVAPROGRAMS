package myPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

	int id;
	String name;
	public Student (int id,String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s=new Student(13, "Nikita");
		Student s1=new Student(11, "Pratham");
		Student s2=new Student(15, "Adi");

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		Collections.sort(al);
		for(Student c: al) {
			System.out.println(c.id+" "+c.name);
		}

	}

	@Override
	public int compareTo(Student o) {
		if(id==o.id)
			return 0;
		
		else if (id>o.id) 
			return 1;
					
			else
				return -1;
			
		
	}
}
