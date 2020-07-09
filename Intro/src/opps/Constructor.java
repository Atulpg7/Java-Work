package opps;



class Vehicle
{
	int wheels;
	
	 Vehicle() {
		
		wheels=4;
	}
	 Vehicle(int a) {
			
		wheels=a;
	}
}


public class Constructor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle c=new Vehicle(5);
		
		System.out.println(c.wheels);

	}

}
