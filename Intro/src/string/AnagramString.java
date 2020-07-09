package string;
import java.util.*;

public class AnagramString {
	
	public static void main(String[] args)
	{
		
		
		String str1=null,str2 = null;
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		

		str1=sc.nextLine();
		str2=sc.nextLine();
		
		boolean isAnagram=true;
		boolean visited[]=new boolean[str2.length()];
		
		
		boolean l=(str1.length()==str2.length());
		
		if(!l)
			System.out.println("Not Alagram String");
		else
		{
//			for(i=0;i<str1.length();i++)
//			{
//				isAnagram=false;
//				char c=str1.charAt(i);
//				
//				for(j=0;j<str2.length();j++)
//				{
//					if(str2.charAt(j) == c && !visited[j])
//					{
//						
//						visited[j]=true;
//						isAnagram=true;
//						break;
//					}	
//				}
//				
//				if(!isAnagram)
//				{
//					break;
//				}
//			}
			
			int al[]=new int[256];
			
			for(char c: str1.toCharArray())
			{
				int index=(int) c;
				al[index]++;
			}
			
			for(char c: str2.toCharArray())
			{
				int index=(int) c;
				al[index]--;
			}
			
			for(i=0;i<256;i++)
			{
				if(al[i]!=0)
				{
					isAnagram=false;
				}
				
			}
		
		
		if(isAnagram)
		System.out.println("Anagram String");
		else
		System.out.println("Not Anagram");
		
		}
		
		
		
	}

}
