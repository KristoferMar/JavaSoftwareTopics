package smallTopics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteReadToFile {

	public static void main(String[] args) throws IOException {

		WriteReadToFile w = new WriteReadToFile();

		//Using FileWriter and PrintWriter
//		w.writeToFile();
	
		//Using BufferedWriter
//		w.whenWriteStringUsingBufferedWritter_thenCorrect();
		
		//Read file using BufferedReader
		w.readFile();
	}
	
	//Write to file using FileWriter and PrintWriter
	public void writeToFile() {
		//Write to file using 
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\kristofer\\Desktop\\File.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println("Some text");
			printWriter.println("Some text on second line");
			printWriter.println("Some text on thirth line");

			printWriter.close();

		} catch (IOException e) {
			System.out.println("error!");
		}
	}

	//Write to file using BufferedWriter.
	public void whenWriteStringUsingBufferedWritter_thenCorrect() throws IOException {
		String str = "Hello this is a test.";
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kristofer\\Desktop\\File.txt"));
		writer.write(str);

		writer.close();
	}
	
	//Read from file using BufferedReader
	public void readFile() throws IOException {
		// We need to provide file path as the parameter: 
		  // double backquote is to avoid compiler interpret words 
		  // like \test as \t (ie. as a escape sequence) 
		  File file = new File("C:\\Users\\kristofer\\Desktop\\File.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
	}
}
