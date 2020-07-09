package Collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringCheck {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		
		
		Set<Character> set=new LinkedHashSet<>();
		boolean flag=true;
		
		for(char ch: c)
		{
			if(!(set.add(ch)))
			{
				System.out.println("Not a Good String");
				System.out.println("First Repeating Char: "+ch);
				flag=false;
				break;
			}
			else
			{
				System.out.println("First non Repeating Char: "+ch);
			}
		}
		
		if(flag)
			System.out.println("Good String");
		
		
		
		
	}

}
