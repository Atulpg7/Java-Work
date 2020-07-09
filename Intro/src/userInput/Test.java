package userInput;


class Student{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class Test {

	public static void main(String[] args) {
		
		Student s=new Student(101,"Priya");
		
		System.out.println(s.id+" Name: "+s.name);

	}

}
