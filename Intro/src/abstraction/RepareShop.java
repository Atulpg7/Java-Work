package abstraction;

public class RepareShop {
	
	public static void repareCar(Car car)
	{
		System.out.println("Car is repared");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Wagnor w=new Wagnor();
		Audi a=new Audi();

		
		repareCar(w);
		repareCar(a);
		

	}

}
