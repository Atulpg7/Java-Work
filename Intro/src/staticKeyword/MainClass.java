package staticKeyword;

import array.Array;
import staticKeyword.A.B;
import staticKeyword.A.C;

public class MainClass {
	
	//Static Block
	static
	
	{
		System.out.println("Block 1");
	}
	
	static
	
	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		
		
		A a=new A();
		B b=a.new B();
		C c=new A.C();

			System.out.println("Block 3");
		

	}

}
