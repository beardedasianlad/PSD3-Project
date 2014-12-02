package uk.ac.glasgow.sg.team5.toolkit;

import java.util.Scanner;

public class EntropyChecker {
	String password;
	double entropy;
	StringBuilder toprint = new StringBuilder();
	boolean reportFlag = false;
	public EntropyChecker(boolean reportFlag){
		this.reportFlag = reportFlag;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Password to check strength:");
		password = sc.next();
		entropy = this.generateEntropy();
		toprint.append("Password Entropy: "+entropy+"\n");
		toprint.append("Password Length: " + password.length() + "\n");
		toprint.append(this.calculatePasswordStrength(entropy));
		GenerateReport gr = new GenerateReport(toprint.toString(), reportFlag);
	}
	
	
	public EntropyChecker(){
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	
	public double generateEntropy(){
		int passwordLength = password.length();
		char[] passwordArray = password.toCharArray();
		double passwordbit = 0;
		boolean nonalphaCharFlag = false;
		boolean alphaFlag = false;
		for(int i = 0; i < passwordLength; i++){
			if(i == 0){
				passwordbit= 4;
			}
			if(i > 0 && i < 10 ){
				passwordbit = passwordbit +2.3;
			}
			if(i > 10 && i < 21){
				passwordbit= passwordbit+1.5;
			}
			
			if(i > 21){
				passwordbit++;
			}
			if(!Character.isLetter(passwordArray[i])){
				nonalphaCharFlag = true;
			}
			if(Character.isLetter(passwordArray[i])){
				alphaFlag = true;
			}	
		}
		if(nonalphaCharFlag == true && alphaFlag == true){
			passwordbit = passwordbit + 6;
		}
		return passwordbit;
	}
	public String calculatePasswordStrength(double entropy){
		if(entropy < 28){
			return "Password Strength: Very Weak\n";
		}
		if(entropy > 27 && entropy < 36){
			return ("Password Strength: Weak\n");
		}
		if(entropy > 35 && entropy < 60){
			return ("Password Strength: Reasonable\n");
		}
		if(entropy > 59 && entropy < 128){
			return ("Password Strength: Strong\n");
		}
		if(entropy > 127){
			return ("Password Strength: Very Strong\n");
		}
		
		return "ERROR";
	}
}