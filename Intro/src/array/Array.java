package array;
import java.util.Scanner;

public class Array {
	
	public  static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length: ");
		n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element "+i+" :");
			a[i]=sc.nextInt();
		}
		
		System.out.print("Your Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		
		
	}

}
