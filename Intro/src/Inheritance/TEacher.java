package Inheritance;

public class TEacher extends Person {
	
	
	public TEacher(String name)
	{
		super(name);
		System.out.println("Inside Teacher Constructor");
	}
	
	public void Teach()
	{
		System.out.println(name+" is Teaching");
	}
	
	
	public static void laugh()
	{
		System.out.println("Teacher is Laughing");
	}
	
	
	//Override the parent function
	public void Walk()
	{
		super.Walk();
		System.out.println(name+" is Walking");
	}

}
