package practice_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		
		String name="/Users/atulkumar/Desktop/text.txt";
		
		File file=new File(name);
		
		try {
			
			Scanner in=new Scanner(file);
			
			while(in.hasNextLine())
			{
				System.out.println(in.nextLine());
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found !!!");
		}
	}

}
