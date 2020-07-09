package sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		int n;
		
		System.out.println("Enter Length: ");
		n=cin.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=cin.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
				 int t=a[j];
				 a[j]=a[j+1];
				 a[j+1]=t;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		
	}
	
}
