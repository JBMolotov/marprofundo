import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
  public static String[] readFile(String fileName) {
	int wordCount = 0; 
	String placarString[] = new String[100];
		
	try {
	  File myObj = new File(fileName);
	  Scanner myReader = new Scanner(myObj);
	  while (myReader.hasNextLine()) {
	    String data = myReader.nextLine();
	    placarString[wordCount++] = data;
	  }
	  myReader.close();
	} catch (FileNotFoundException e) {
	  System.out.println("An error occurred.");
	  e.printStackTrace();
	}
	
	return placarString;
  }
  
  public static void writeFile(String fileName, String lineStrings[]) {			
	try {
		FileWriter myWriter = new FileWriter(fileName);
		for(int i=0; i<100; i++) {
			if(lineStrings[i] != null) {
				myWriter.write(lineStrings[i]);
			}			
		}
		myWriter.close();	
	} catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
  }
}