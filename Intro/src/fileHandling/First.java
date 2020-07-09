package fileHandling;


import java.io.*;
import java.util.*;

public class First {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter writer=new FileWriter("File.txt");
		Scanner sc;
		
		System.out.println("Writing Data.....");
		
		sc=new Scanner(System.in);
		
		
		for(int i=0;i<10;i++)
		{
			writer.write(i+""+"\n");
		}
		
		System.out.println("Writing Done.....");
		
		
		sc.close();
		writer.close();
		
		FileReader reader=new FileReader("File.txt");
		System.out.println("Reading Data......");
		
		sc=new Scanner(reader);
		
		
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		reader.close();

	}

}
