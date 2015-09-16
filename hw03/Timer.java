// HW03
// Christopher Collado




//imports Scanner class for input
//imports Math class for mathematics
import java.util.Scanner;
import static java.lang.Math.*;

public class Timer {
    public static void main(String[] args){
        
         Scanner scanner1 = new Scanner(System.in);
         
         //asks for users input on basic data
         System.out.println("What time is it now? (Insert in military time, HHMM)");
         int userTime= scanner1.nextInt();
         
         System.out.println("What time is dinner? (Insert in military time, HHMM)");
         int dinnerTime= scanner1.nextInt();
         
         //seperates hour from variable for calculations
         int userHour= userTime/100;
         int dinnerHour= dinnerTime/100;
         
         //calculates hours until dinner , also gives positive result just incase time turns out to be negative
         int hoursLeft= dinnerHour-userHour;
        
        //seperates minutes from hours for calculates
         int userMinutes= userTime - (userHour *100);
         int dinnerMinutes = dinnerTime - (dinnerHour * 100);
         
        //calculates minutes left
         float minutesLeft= (float) dinnerMinutes - (float) userMinutes;
         
         int minutesLeft2 = (int) minutesLeft;
         int minutesLeft3 = minutesLeft2;
         
        //detects if number is a positive or negative 
         int minutesLeftComp = (int) signum(minutesLeft) ;
         
         //adjusts for negative number (meaning hour needs to be changed too)
         boolean comparison = minutesLeftComp == -1;
         
         if ( comparison ) {
             
             //decrements hour
             hoursLeft = hoursLeft - 1;
             
             
             minutesLeft = 60 - userMinutes;
             //sets new value for minutes left until dinner
             minutesLeft3= (int) minutesLeft + dinnerMinutes;
         }
         //prints out final result
         System.out.println("You have " + hoursLeft + " hours and " + minutesLeft3 + " minutes left ");
         
         
    }
}