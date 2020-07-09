package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		TEacher t=new TEacher("Atul");
	
		t.Eat();
		t.Walk();
		t.Teach();
		
		Singer s=new Singer("Aman");
		
		s.name="Aman";
		s.Singing();
		s.Walk();
		
		
		
		//Upcasting and Downcasting
		TEacher t3=new TEacher("Aman");
		
		Person p=t;
		
		//Downcasting
		TEacher t1= (TEacher) p;
		

	}

}
