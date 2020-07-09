package abstraction;

public class Audi extends Car {
	
	
	
	public void breaking()
	{
		System.out.println("Audi is Breaking");
	}

	@Override
	public void accelerate() {
			System.out.println("Audi is Running");	
	}
}
