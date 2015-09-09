// HW02
// Christopher Collado


import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
       //will take input from user
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("how many socks did you want to buy?");
        //Number of pairs of socks
        int nSocks= myScanner.nextInt();
        
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        System.out.println("how many glasses did you want to buy?");
        //Number of drinking glasses
        int nGlasses= myScanner.nextInt();
        //Cost per glass
        double glassCost$=2.29;
        
        System.out.println("how many envelopes did you want to buy?");
        //Number of boxes of envelopes 
        int nEnvelopes= myScanner.nextInt();
        
        //cost per box of envelopes
        double envelopeCost$= 3.25;
       
       
        double taxPercent= 0.06;
        
        
        //will calculate totals of each item
        double totalSockCost = nSocks * sockCost$;
        double totalEnvelopeCost = nEnvelopes * envelopeCost$;
        double totalGlassCost =  nGlasses * glassCost$;
        double totalCost = totalGlassCost + totalEnvelopeCost + totalSockCost;
        
        
        //calculates final totals of each item (with tax)
        double totalFinalCost = (totalCost * taxPercent) + totalCost;
        double totalFSockCost = (totalSockCost * taxPercent) + totalSockCost;
        double totalFEnvelopeCost = (totalEnvelopeCost * taxPercent) + totalEnvelopeCost;
        double totalFGlassCost = ((totalGlassCost * taxPercent) + totalGlassCost);
        double totalFinalCostDifference= (totalFGlassCost + totalFEnvelopeCost + totalFSockCost) -
        totalFinalCost;
        System.out.println(totalFinalCostDifference);
        
        //prints out receipt
        System.out.println( "Your total will be $" + totalSockCost +
        " for socks, $" + totalGlassCost + " for glasses, and $"
        + totalEnvelopeCost + " for envelopes, making it a total of $" 
        + totalCost);
        
        //prints out final receipt
        System.out.println( "Your final cost for each item, being socks,"
        + " glasses, and envelopes respectively, is $" + totalFSockCost + 
        ", $" + totalFGlassCost + ", and $" +totalFEnvelopeCost);
        System.out.println("Your final total, with tax, is $" + totalFinalCost);
    }
}