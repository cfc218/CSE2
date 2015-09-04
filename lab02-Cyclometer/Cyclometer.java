// CSE002- lab02
// Christopher Collado
// September 9th 2015


//program should, for two trips and given time elapsed in seconds and rotations of front wheel during that time:
//print the number of minutes for each trip
//print the number of counts for each trip
//print the distance of each trip in miles
//print the distance for the two trips combined



public class Cyclometer {
    public static void main(String[] args) {
        //time in seconds for trips one and two
        int timeTrip1=480;  
       	int timeTrip2=3220; 
       	
       	//number of front wheel rotations for trips one and two
		int rotationsTrip1=1561; 
		int rotationsTrip2=9037; 

        //useful constants:
        double wheelDiameter=27.0,  
    	PI=3.14159, 
  	    feetPerMile=5280,  
  	    inchesPerFoot=12,   
  	    secondsPerMin=60;  
	    double distanceTrip1, distanceTrip2, totalDistance; 
	    
	    //prints out time and counts for each trip
	    System.out.println("Trip 1 was " + (timeTrip1/secondsPerMin) +" minutes long with "
	    + (rotationsTrip1) + " counts of front wheel rotations.");
	    
	    System.out.println("Trip 2 was " + (timeTrip2/secondsPerMin) +" minutes long with "
	    + (rotationsTrip2) + " counts of front wheel rotations.");
	    
	    
	    //calculates distance traveled/circumference of wheel in inches
	    distanceTrip1 = rotationsTrip1*PI*wheelDiameter;
	    distanceTrip2 = rotationsTrip2*PI*wheelDiameter;
	    
	    //converts inches to feet
	    distanceTrip1 = distanceTrip1/inchesPerFoot;
	    distanceTrip2 = distanceTrip2/inchesPerFoot;
	    
	    //converts feet to miles
	    distanceTrip1 = distanceTrip1/feetPerMile;
	    distanceTrip2 = distanceTrip2/feetPerMile;
	    
	    //total distance
	    totalDistance = distanceTrip2+distanceTrip1;
	    
	    //prints out distances
	    System.out.println("Trip 1 was "+ distanceTrip1 + " miles long.");
	    System.out.println("Trip 2 was "+ distanceTrip2 + " miles long.");
	    System.out.println("Total distance was "+totalDistance +" miles long.");
	    
}
}