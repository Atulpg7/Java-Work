package Inheritance;

public class Person {
	
	
	protected String name;
	
	public Person(String name)
	{
		this.name=name;
	}
	
	public void Walk()
	{
		System.out.println("person "+name+" is Walking");
	}
	public void Eat()
	{
		System.out.println("person "+name+" is Eating");
	}
	
	
	public static void laugh()
	{
		System.out.println("Teacher is Laughing");
	}

}
