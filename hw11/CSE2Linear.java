import java.util.*;

public class CSE2Linear {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		int[] finalGrades= new int[15];
		int i=0;
		System.out.println("Insert the 15 final grades for your students:");
		
		//loop will run through and take input for each grade
		for(i =0; i < 15; i++) {
			//takes input as string
			String test = inputScan.next();
			
			//string will be passed to method to verify if it's an integer
			Boolean pass = verify(test);
			
			//if test fails, will take appropriate action 
			if(pass == false) {
				System.out.println("ERROR INSERT INT:");
				i--;
				continue;
			}
			
			else{
			//if test passes will set test integer to verify conditions 	
				int j = Integer.parseInt(test);
				
			//if number out of range will take appropriate action	
				if(j < 0 || j > 100 ) {
					System.out.println("OUT OF RANGE INSERT NUMBER BETWEEN" +
					"0 TO 100: ");
					i--; 
					continue;
				}
				
			//at this point if it's made it through it meets the correct conditions
			//sets array value to input then checks if greater than or equal to last value
				finalGrades[i] = j;
				if(i != 0) {
					
					if(finalGrades[i] < finalGrades[i-1]) {
						System.out.println("INSERT A VALUE GREATER OR EQUAL TO THE LAST: ");
						i--;
					}
				}
				
			}
			//end of else statement
		}
		//end of for loop
		System.out.println("Final grades input are:");
		for (i =0; i < 15; i++) {
			System.out.println(finalGrades[i]);
		}
		
		//takes in input for value to find within array
		System.out.println("\n Insert a grade to find within the array:" );
		int input = inputScan.nextInt();
		int k =0;
		
		
		//loop linearly searches array and prints out results
		for(i =1; i < 15; i++) {
			k++;
			if(finalGrades[i] == input) {
				System.out.println(input +" was found after "+ k+ " iterations");
				break;
				}
			if(i==14) {
				System.out.println(input+" was not found in the list");
			}
		}
		
		finalGrades = shuffle(finalGrades);
		
		//prints out recently shuffled array
		System.out.println("Scambled:");
		for (i =0; i < 15; i++) {
			System.out.println(finalGrades[i]);
		}

		//takes in input for value to find within array
		System.out.println("\n Insert a grade to find within the array:" );
		 input = inputScan.nextInt();
		 k =0;
		
		
		//loop linearly searches array and prints out results
		for(i =1; i < 15; i++) {
			k++;
			if(finalGrades[i] == input) {
				System.out.println(input +" was found after "+ k+ " iterations");
				break;
				}
			if(i==14) {
				System.out.println(input+" was not found in the list");
			}
		}
		
		
		
		
}
	
	public static int[] shuffle(int[] grades) {
        int target =0;
        int temp = 0;
	
	for(int i=0; i< 15; i++) {
	   target = (int) Math.floor(Math.random() * 15);
		  
		    if (target ==0) {
			  i--;
			  continue;
		     }
		  
		      temp = grades[0];
		    grades[0] = grades[target];
		    grades[target] = temp;
	    }
	 return grades;
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
