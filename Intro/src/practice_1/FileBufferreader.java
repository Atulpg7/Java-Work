package practice_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferreader{
	
	public static void main(String args[]) throws FileNotFoundException,IOException  {
		
		String name="/Users/atulkumar/Desktop/text.txt";
		
		
			FileReader fr = new FileReader(name);
			BufferedReader r = new BufferedReader(fr);
			
			
			String line = null;
			
			while((line= r.readLine())!=null)
			{
				System.out.println(line);
			}
			
			//while((r.readLine())!=null)
			//	System.out.println(r.readLine());
			
			r.close();
		
		
	}

}
