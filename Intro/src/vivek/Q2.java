package vivek;

import java.util.*;

class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private double cpi;
	
	Student(int id,String name,double cpi){
		this.id=id;
		this.name=name;
		this.cpi=cpi;
	}
		
	@Override
	public int compareTo(Student s2) {	
		return (cpi)<s2.cpi?1:-1;			
	}
	
	@Override
	public String toString(){
		return "Id: "+id+" Name: "+name+" Cpi: "+cpi;
	}
	

}

public class Q2 {

	public static void main(String[] args) {
		
		PriorityQueue<Student> q=new PriorityQueue<Student>();
		
		q.add(new Student(101,"Vivek",1.5));
		q.add(new Student(105,"New",7.0));
		q.add(new Student(102,"Atul",9.5));
		q.add(new Student(103,"Nikhil",5.5));
		q.add(new Student(106,"New 2",2.7));
		q.add(new Student(104,"Aman",6.5));
		
		
		for(Student s: q)
			System.out.println(s);
		/*
		while(!q.isEmpty())
			System.out.println(q.poll());*/
		
	}

}
