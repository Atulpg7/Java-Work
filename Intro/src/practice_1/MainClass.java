package practice_1;

import java.io.File;

public class MainClass{

	public static void main(String[] args) 
	{
		
//		String[] a=new String[20];
//		
//		
//		try
//		{
//		for(String t: a)
//			System.out.println(t.toUpperCase());
//		}catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		
		File f=new File("f1.txt");
		File f2=new File("f1.txt");
		
		if(f.compareTo(f2)==0)
		{
			System.out.println("Hii");
		}
	}


}
