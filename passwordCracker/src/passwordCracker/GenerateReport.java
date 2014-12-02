package passwordCracker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GenerateReport {
	String toprint;
	
	public GenerateReport(String toprint , boolean generateFlag){
		this.toprint = toprint;
		if(generateFlag == true){
			try {
				this.writeReport(toprint);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.print(toprint);
		}
	}
	
	
	public void writeReport(String toprint) throws IOException{
		FileWriter reportWriter = new FileWriter("Report.txt");
		reportWriter.write(toprint);
		reportWriter.close();
	}
	
}
