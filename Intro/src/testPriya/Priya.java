package testPriya;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Priya {

	public static void main(String[] args) {
		File file = new File("/Users/atulkumar/desktop/Java/intro/src/testPriya/New.txt");
	      try {
	        boolean createFile = file.createNewFile();
	        if (createFile) {
	          System.out.println("New File is created.");
	        }else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	      
	     
	}
}


