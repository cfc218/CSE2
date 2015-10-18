//HW08 PT II Chris Collado CSE002 
import java.util.*;

public class StringAnalysis {
	public static void main(String[] args) {
		
		//initial variables
		String input = "0", check1 = "0",x = "0";
		Scanner inputScan = new Scanner(System.in);
		char choice;
		int eval, check = 0;
		Boolean evaluation = false, exit = false;
		
		//asks user to input initial string
		System.out.println("Input string: ");
		input = inputScan.next();
		
		System.out.println("Would you like to process the entire string? Y/N");
		
		//loop will decide whether partial or entire string will be processed
		do{
			x = inputScan.next();
			
			choice = x.toLowerCase().charAt(0);
			
			//switch loop redirects to proper method for evaluation
			switch(choice) {
				case 'y' :
					evaluation = entire(input);
					exit = true;
					break;
				
				case 'n' :
					evaluation = partial(input);
					exit = true;
					break;
					
				default:
					System.out.println("Invalid input try again: ");
					break;
			}
		
		}while(exit == false);
		
		if(evaluation == true) {
			System.out.println("This is a valid string");
		}
		else{
			System.out.println("This is an invalid string");
		}
	
		
}
	public static Boolean entire(String input){
		Scanner inputScan = new Scanner(System.in);
		String value1 = "0";
		boolean evaluation = false, success= false;
		int i =0, value = input.length();
		
		
		forloop:
			for(i = 0; i < value; i++) {
				evaluation = Character.isLetter(input.charAt(i));
				if (evaluation == false){
					break forloop;
				}	
			}
		return evaluation;
	}
	
	public static Boolean partial(String input){
		Scanner inputScan = new Scanner(System.in);
		String value1 = "0";
		boolean evaluation= false, success= false;
		int i =0, j = input.length(), k =0, value = 0;
		
		//loop takes and verifies input of characters to process 
		do {
			System.out.println("How many characters would you like to process :");
			value1 = inputScan.next();
			success = verify(value1);
		}while(success == false);
		
		//sets confirmed integer value
		value = Integer.parseInt(value1);
		
		//sets value for end of string
		if (value > j) {
			k = j; }
		else { k = value; 
		}
		
		//for loop will go through each character of loop
		//if finds anything besides a character will break out of loop
		forloop:
		for(i = 0; i < k; i++) {
			evaluation = Character.isLetter(input.charAt(i));
			if (evaluation == false){
				break forloop;
			}	
		}
		return evaluation;
}
	
	
	public static Boolean verify(String unit1) {
		int unit = 0;
		try { unit = Integer.parseInt(unit1); }
	 		catch (NumberFormatException e) {
		 		System.out.println("error: invalid value. Must be a double. Try again."); 
		 		return false;
	 		}
		return true;
}
	
}
