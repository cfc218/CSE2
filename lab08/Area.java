import java.util.*;
import java.math.*;

public class Area {	
	public static void main(String[] args) {
		
		//initial variables
		int i = 0, j = 0;
		String input = " ";
		int success = 0;
		Scanner shapeScan = new Scanner(System.in);
		double area = 0;
	 	
		
		//loop will take input and verify which shape was chosen
		do {
			System.out.print("Choose either rectangle, triangle, circle: ");
			input = shapeScan.next();
			success = validation(input);			
			
			if ( success == 0 ) {
				System.out.println("Invalid input try again");	
			}
		}while(success < 1);
	
		//loop will redirect to method dependent on previous result
		switch (success) {
			case 1: 
				area= rectangle();
				break;
		
			case 2:
				area = triangle();
				break;
		
			case 3: 
				area = circle();
				break;
			
			default:
				break;
		}
		System.out.printf("Your area is %.2f square meters. \n", area);
}
	
	//method gives result that will redirect to proper method for area evaluation
	public static int validation(String input) {
		switch(input) {
		case "rectangle":
			return 1;
			
		case "triangle":
			return 2;
			
		case "circle":
			return 3;
		
		default:
			return 0;
			
			
		}
		
	}	

	//takes in input and evaluates area of a circle
	public static double circle() {
		
		double radius = 0, area = 0;
		Scanner unitScan = new Scanner(System.in);
		String radius1 = "0";
		boolean exit = false;
		boolean success;		
		// do loop will test for input
		do {
			
				//scans for input and tests if valid
				System.out.println("Insert the radius: ");
				radius1 = unitScan.next();
				success = ( dimensionValidation(radius1));
				
			if (success == true) {
				radius =  Double.parseDouble(radius1);
				area = Math.PI * radius * radius;
				exit = true;
			}	
		}while(exit == false);
		
		return area;
}

	//takes in input and evaluates area of a circle
	public static double rectangle() {
	int i = 0;
	double length = 0, width = 0, area = 0;
	String length1, width1;
	length1 = width1 = "0";
	
	Scanner unitScan = new Scanner(System.in);
	boolean exit = false;
	boolean success1= false, success2= false;	
	
	do{
		if(success1 == false) {
			System.out.println("Insert the length: ");
			length1 = unitScan.next();
			success1 = dimensionValidation(length1);
		}
		
		if(success2 == false) {
			System.out.println("Insert the width: ");
			width1 = unitScan.next();
			success2 = dimensionValidation(width1);
		}
		
		if (success1 == true && success2 == true) {
			length =  Double.parseDouble(length1);
			width = Double.parseDouble(width1);		
			area = length * width;
			exit = true;
		}	
	}while(exit == false);
	
		return area;
}
	
	//takes in input and evaluates area of a circle
	public static double triangle() {
		double base = 0, height = 0, area = 0;
		String base1, height1;
		base1 = height1 = "0";
		
		Scanner unitScan = new Scanner(System.in);
		boolean exit = false;
		boolean success1= false, success2 = false;	
		
		do{
			if(success1 == false){
				
				System.out.println("Insert the length of the base: ");
				base1 = unitScan.next();
				success1 = dimensionValidation(base1);
			}
			
			if(success2 == false) {
				System.out.println("Insert the height: ");
				height1 = unitScan.next();
				success2 = dimensionValidation(height1);				
			}
			
			if (success1 == true && success2 == true) {
				base = Double.parseDouble(base1);
				height= Double.parseDouble(height1);
				area = .5 * base * height;
				exit = true;
			}
		}while(exit == false);
		
	return area;
}
	
	//method verifies if input is a double
	public static Boolean dimensionValidation(String unit1) {
		double unit = 0.0;
		try { unit = Double.parseDouble(unit1); }
	 	 catch (NumberFormatException e) {
	 		System.out.println("error: invalid value. Must be a double. Try again."); 
	 		return false;
	 	 }
		return true;
}
	
}
