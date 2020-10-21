package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
public class main {

	public static void createFile() {
		
	File file = new File("C:\\Users\\enbiy\\eclipse-workspace\\JavaDers7FileReadWrite\\students.txt");
	
	try {
	file.createNewFile();}
	catch(Exception exception){System.out.println("Hata oluþtu: "+exception);}
	finally {}
	
	}
	
	
	public static void readFile() throws FileNotFoundException {
		
		File file = new File("C:\\Users\\enbiy\\eclipse-workspace\\JavaDers7FileReadWrite\\students.txt");
         
		Scanner reader=new Scanner(file);
		try{while(reader.hasNext()) {
			String line=reader.nextLine();
			System.out.println(line);
			}
		
		
		reader.close();}
		catch(Exception exception){System.out.println("Sorun oluþtu: " + exception);}
		finally {System.out.println("Okuma Ýþlem bitti.");}
		
		
	}
	
	
	
	
	
	public static void writeFile() {
		
		File file = new File("C:\\Users\\enbiy\\eclipse-workspace\\JavaDers7FileReadWrite\\students.txt");
		
		try{
		FileWriter fileWriter = new FileWriter(file, true);
		// true ise sona ekler false ise baþtan yazar 
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
		fileWriter.write("ahmet");
		fileWriter.close();
		}
		catch(Exception exception){System.out.println(exception);}
		finally {}
		
		
	}
	
	
	


	public static void main(String[] args) throws FileNotFoundException {

	createFile();
	readFile();
	writeFile();
	readFile();
	

	

		
		
		
	
	}
}
