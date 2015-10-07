// Bar Graph
import java.util.*;
import java.io.*;
public class BarGraph {
    //defines main method
    public static void main(String[] args) {
    	 Scanner expenseScan = new Scanner(System.in);
         int i= 1;
         int j = 1;
      
        String monday = "0", tuesday = "0", wednesday = "0", thursday = "0", friday = "0", saturday = "0", sunday= "0";
        double monday1 = 0, tuesday1=0, wednesday1=0, thursday1=0, friday1=0, saturday1=0, sunday1=0;

		//collects data
         do {

         do { 
 		 System.out.print("Expenses for Monday: $ ");
 		 	monday = expenseScan.next();
 		 	 
 		 	 try { monday1 = Double.parseDouble(monday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		monday = "0";
 		 	}

 		 	if(monday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		monday = "0";}
		if (monday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 1);
          
          
          
          do { 
 		 System.out.print("Expenses for Tuesday: $ ");
 		 	tuesday = expenseScan.next();
 		 	 
 		 	 try { tuesday1 = Double.parseDouble(tuesday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		tuesday = "0";
 		 	}

 		 	if(tuesday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		tuesday = "0";}
		if (tuesday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 2);
           
          
          
          do { 
 		 System.out.print("Expenses for Wednesday: $ ");
 		 	wednesday = expenseScan.next();
 		 	 
 		 	 try { wednesday1 = Double.parseDouble(wednesday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		wednesday = "0";
 		 	}

 		 	if(wednesday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		wednesday = "0";}
		if (wednesday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 3);
         
          
          do { 
 		 System.out.print("Expenses for Thursday: $ ");
 		 	thursday = expenseScan.next();
 		 	 
 		 	 try { thursday1 = Double.parseDouble(thursday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		thursday = "0";
 		 	}

 		 	if(thursday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		thursday = "0";}
		if (thursday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 4);


          
          
          do { 
 		 System.out.print("Expenses for Friday: $ ");
 		 	friday = expenseScan.next();
 		 	 
 		 	 try { friday1 = Double.parseDouble(friday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		friday = "0";
 		 	}

 		 	if(friday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		friday = "0";}
		if (friday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 5);
           
          
          
          do { 
 		 System.out.print("Expenses for Saturday: $ ");
 		 	saturday = expenseScan.next();
 		 	 
 		 	 try { saturday1 = Double.parseDouble(saturday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		saturday = "0";
 		 	}

 		 	if(saturday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		saturday = "0";}
		if (saturday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 6);
          
           
          
          
          do { 
 		 System.out.print("Expenses for Sunday: $ ");
 		 	sunday = expenseScan.next();
 		 	 
 		 	 try { sunday1 = Double.parseDouble(sunday); }
 		 	 catch (NumberFormatException e) {
 		 		System.out.println("error: invalid value. Try again."); 
 		 		sunday = "0";
 		 	}

 		 	if(sunday1 < 0) {
 		 		System.out.println("error: negative value. Try again.");
 		 		sunday = "0";}
		if (sunday != "0") { i++;
				System.out.println(" ");
		}
          }while (i == 7);
          

    	}while (i < 8);
    	
 
    	double star;
    	int star1;
		
    	//returns graph

		star = monday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Monday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
          	System.out.println(" ");
          	star = tuesday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Tuesday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
          	System.out.println(" ");
          	star = wednesday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Wednesday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
          	System.out.println(" ");
         	star = thursday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Thursday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
          
      		System.out.println(" ");
          	star = friday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Friday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
      		System.out.println(" ");
          	star = saturday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Saturday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
          	System.out.println(" ");
          	star = sunday1*100;
 			star1 = (int) star / 100;
 			System.out.print("Sunday: ");
         do { 
 			System.out.print("*");
			star1--;
          }while (star1 > 0);
          
       	double average = (monday1+tuesday1+wednesday1+thursday1+friday1+saturday1+sunday1)/7;
       	double average1 = 0;
       	double averagetotal = average;
       	System.out.printf("\nYour weekly average expenditure is: %.2f", average);
       	
       	 int percent = 0;
       	 i= 1;
       	 	do {
       	 		percent = (int) Math.floor(Math.random() * 20);
       	 		average1 = average*(1 + ((double) percent/100));
       	 		averagetotal = averagetotal+ average1;
       	 		i++;
       	 	}while (i < 53);
       	System.out.printf("\nYour estimated expenditure for the next four years are: %.2f\n",averagetotal);

          
          
    }
}