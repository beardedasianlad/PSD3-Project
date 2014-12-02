package passwordCracker;

public class ToolkitMain {
	public static void main(String args[]){
		String command = args[0];
		
		if(command.compareTo("--help") == 0){
			System.out.println("Instructions here");
			return;
		}
		
		if(args.length < 2){
			System.out.println("Usage:java BruteForceInterface [arguments] [password]. \n Type --help for more.");
			return;
		}
		
		
		if(command.charAt(0) == '-'){
			boolean reportFlag = false;
			boolean bruteForce = false;
			boolean entropyGen = false;
			boolean passwordGen = false;
			for(int i = 1; i < command.length(); i++){
				if(command.charAt(i) == 'b'){
					bruteForce = true;
				}
				if(command.charAt(i) == 'e'){
					entropyGen = true;
				}
				if(command.charAt(i) == 'r'){
					reportFlag = true;
				}
				if(command.charAt(i) == 'l'){
					passwordGen = true;
				}
			}
			if(entropyGen == true){
				EntropyChecker ec = new EntropyChecker(reportFlag);
			}
			if(bruteForce == true){
				BruteforceEngine bfe = new BruteforceEngine();
			}
			if(passwordGen == true){
				PasswordListGenerator passGen = new PasswordListGenerator();
			}
			
		}
	}
}
