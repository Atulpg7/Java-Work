package Collections;

import java.util.*;

class Teacher{
	private int id;
	private String name;
	
	Teacher(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "Teacher Id: "+id+" Name: "+name;
		
	}
	
}


class Student{
	private int id;
	private String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "Student Id: "+id+" Name: "+name;
		
	}
	
}

public class SetCollection {

	public static void main(String[] args) {
		
		
		Teacher p1=new Teacher(10,"Atul");
		Teacher p2=new Teacher(20,"Priya");
		
		Student s1=new Student(101,"Aman");
		Student s2=new Student(202,"Raj");

		
		
		Map<Teacher,Student> map=new HashMap<Teacher,Student>();
		
		map.put(p1, s1);
		map.put(p2, s2);
		
		
		for(Map.Entry<Teacher, Student> data:map.entrySet())
		{
			System.out.println(data.getKey());
		}

	}

}
