package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		Pet p=d;
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		
//		Greetings();
//		Greetings("Atul Kumar");
		
		
		

	}
	
	public static void Greetings()
	{
		System.out.println("Hii there");
	}
	
	public static void Greetings(String name)
	{
		System.out.println("Hii there Mr. "+name);
	}

}
