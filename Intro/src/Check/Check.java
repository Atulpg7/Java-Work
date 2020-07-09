package Check;

import java.util.*;
public class Check {
	
	static void Validate(int age)
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d=a+b+c;
		if(d>100)
			throw new ArithmeticException("Greater");
		else if(d<100 && d>80)
			throw new NullPointerException("Medium");
		else if(d<80 && d>50)
			throw new ArrayIndexOutOfBoundsException("Small");
		else
			System.out.println("No Exception");
	}
	public static void main(String[] args) {
		
		 try
	      {
			 Validate(17);
	      }
	      catch (ArithmeticException e)
	      {
	    	  System.out.println(""+e.getMessage());
	      }
	      catch (NullPointerException e)
	      {
	    	  System.out.println(""+e.getMessage());
	      }
	      catch (ArrayIndexOutOfBoundsException e)
	      {
	    	  System.out.println(""+e.getMessage());
	      }
		 
		 System.out.println("Done");

	}

}
