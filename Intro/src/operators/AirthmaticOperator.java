package operators;
import java.util.Scanner;

public class AirthmaticOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		
for(int i=1;i<=5;i++)
{
	for(int j=0;j<5-i;j++)
	{
		System.out.print(" ");
	}
	for(int k=0;k<i;k++)
	{
		System.out.print("*");
	}
	
	System.out.println();
	
}
	

	}

}
