package passwordCracker;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PasswordListGenerator {
	
	Scanner sc = new Scanner(System.in);
	public PasswordListGenerator(){
	System.out.println("Enter file output:");
	String outputPath = sc.next();
	System.out.println("Enter size of random word list generated:");
	String sizeString = sc.next();
	if(sizeString.matches("[0-9]+")){
		int listSize = Integer.parseInt(sizeString);
		this.generateFile(outputPath,listSize);
	}else{
		System.out.println("Invalid size specified.");
	}
	
	return;
	}
	public void generateFile(String outputPath, int listSize){
		try {
			FileWriter wordListWriter = new FileWriter(outputPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Wordlist of size " + listSize + " generated at " + outputPath);
	}
	
}
