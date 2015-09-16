// HW03
// Christopher Collado


//imports Scanner class for input
//imports Math class for mathematics
import java.util.Scanner;
import static java.lang.Math.*;

public class Block {
    public static void main(String[] args){
        Scanner scannerA = new Scanner(System.in);
        
        //system takes input of dimensions and stores them in approp. variables
        System.out.println("What is the length?");
        double length = scannerA.nextDouble();
        
        System.out.println("What is the width?");
        double width = scannerA.nextDouble();
        
        System.out.println("What is the height?");
        double height = scannerA.nextDouble();
        
        //calculates volume and truncates to two decimal places
        double volume = length * width * height* 100;
        int volume2 = (int) volume;
        volume = (double) volume2/100;
        
        
        //calculates surface area and truncates to two decimal places
        double side1 = length * width;
        double side2 = width* height;
        double side3 = height* length;
        
        double surfaceArea = 2 * (side1+side2+side3) * 100;
        int surfaceArea2 = (int) surfaceArea;
        surfaceArea = (double) surfaceArea2/100;
        
        System.out.println("The volume of block with dimensions " + length + " * "
        + width + " * " + height + " is " + volume + " and the surface area is " +
        surfaceArea);
    }
}