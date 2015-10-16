import java.util.*;
public class Twisty {
	
	public static void main (String[] args) {
    	 Scanner inputScan = new Scanner(System.in);
    	 
   	  int i= 0;
   	  int j = 0;
	  int a, b, c, y , z, k;
	  k = a= y = z = 0;
	 String length = "0", width = "0";
     int length1 = 0, width1=0;

     
     //collects data input from user
     do {
     
    	 
    	 //collects data for length 
      do { 
    	  System.out.print("Insert length: ");
		 	length = inputScan.next();
		 	
		 	//detects if proper input was used 
		 	 try { length1 = Integer.parseInt(length); }
		 	 catch (NumberFormatException e) {
		 		System.out.println("error: invalid value. Try again."); 
		 		length = "0";
		 	}
         //detects if number is negative
		 	if(length1 < 0) {
		 		System.out.println("error: negative value. Try again.");
		 		length = "0";}
		 	if(length1 > 80) {
		 		System.out.println("error: maximum value of 80. Try again.");
		 		length = "0";}
		 		//if the number is neither negative and a proper input
		 		//will move onto next dimension
		if (length != "0") { 
				i++;
				 }
		}while (i < 1); 
		
      
      	//collects data for width
      do { 
    	  System.out.print("Insert width: ");
		 	width = inputScan.next();
		 	
		 	//detects if proper input was used 
		 	 try { width1 = Integer.parseInt(width); }
		 	 catch (NumberFormatException e) {
		 		System.out.println("error: invalid value. Try again."); 
		 		width = "0";
		 	}
         //detects if number is negative
		 	if(width1 < 0) {
		 		System.out.println("error: negative value. Try again.");
		 		width = "0";}
		 	if(width1 > length1) {
		 		System.out.println("error: length cannot be smaller than width. Try again.");
		 		width = "0";
		 	}
		 		//if the number is neither negative and a proper input
		 		//will move onto next dimension
		if (width != "0") { i=3; }
		}while (i < 2); 
      
       }while ( i < 3);
     
     //loop forms pattern based on input
     //do {
    	 
    //loop forms amounts of lines generated
    for(j = 0; j<(width1); j++) {
    	//loop forms amount of characters generated
    	for (k = 0; k<(length1); k++)	{

			//loop forms spaces before each initial character
    		for ( a= 0; a<j; a++) {
    			System.out.print(" ");
    		}	
    		System.out.print("#");
    		
    		for(b = 0; b < (width1 - (j+1))*2; b++) {
    			System.out.print(" ");  
    			}    		
			System.out.print("#");
			
    		for (c = 0; c < j; c++) {
    			System.out.print(" ");

    	}
    	}
    	System.out.println();
    	
    }
      
    }
}