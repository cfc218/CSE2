// Check Digit Christopher Collado HW06.2
import java.util.*;
import java.io.*;
public class CheckDigit {
    //defines main method
    public static void main(String[] args) {
    	String isbn = "0";
    	double isbn1 = 0;
	 	Scanner isbnScan = new Scanner(System.in);
 		int work = 0;
 		int tenDigit = 0, nineDigit= 0,eightDigit = 0,sevenDigit = 0;
 		int sixDigit=0,fiveDigit=0,fourDigit=0;
 		int threeDigit= 0,twoDigit = 0,oneDigit = 0;
 	    double lessthan = 1000000000.0;
 	    double greaterthan = 10000000000.0;
 	    int i = 1;
	 		//checks if proper ISBN number was entered
	 	do { 
 		 System.out.print("Enter ISBN number: ");
 		 	isbn = isbnScan.next();
 		 	 
	 	if (isbn.length() != 10) {
 		 		System.out.println("error: invalid value. Try again.");
 		 		isbn = "0";}
		if (isbn != "0") { 
		        i++;
				System.out.println(" ");	
			    work = 1;}
				
	          }while (i == 1);

	       
	          //only runs if the proper ISBN number was entered
          int remainder;
          	if (work == 1) {
          	        tenDigit = (int) (isbn1 / greaterthan);
          	        nineDigit = (int) (isbn1 % lessthan) / 10000000;
                    eightDigit = (int) isbn1 % (int) lessthan % 10000000 / 1000000;
          	        sevenDigit = (int) isbn1 % 10000000 / 1000000;
      			    sixDigit = (int) isbn1 % 10000000 % 1000000 / 100000;
      			    fiveDigit= (int) isbn1 % 10000000 % 1000000 % 100000 / 10000;
      			    fourDigit= (int)  isbn1 % 10000000 % 1000000 % 100000 % 10000 / 1000;
      			    threeDigit = (int) isbn1  % 10000000 % 1000000 % 100000 % 10000 % 1000 / 100;
                    twoDigit= (int) isbn1 % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100 / 10;
                    oneDigit = (int) isbn1 % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100 % 10 /1;
      			    
      			System.out.println(tenDigit + " "+nineDigit + " "+eightDigit + " "+
      				sevenDigit + " "+sixDigit + " "+fiveDigit + " "+fourDigit + " "+
      				threeDigit + " "+twoDigit + " "+ oneDigit);
          	}
          	
    }
}
          

