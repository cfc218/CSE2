
public class Shuffle {
public static void main(String[] args) {
	//	suits club, heart, spade or diamond
			String[] suitNames={"C","H","S","D"};
			String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9",
								"10", "J", "Q","K","A"};
			String[] cards = new String[52]; 
			String[] hand = new String[5]; 
			
			for (int i=0; i<52; i++){
			cards[i]=rankNames[i%13]+suitNames[i/13];
			System.out.print(cards[i]+" "); }
			
			printArray(cards);
			shuffle(cards); 
			 System.out.println("shuffled \n");
			printArray(cards);
			hand = randomizeHand(cards);
		 
		    System.out.println("Hand: \n");

			printArray(hand);
		}

		
public static void printArray(String[] cards) {
	for(int i=0; i< cards.length; i++) {
		System.out.print(cards[i] + " ");
	}
}

public static String[] shuffle(String[] cards) {
        int target =0;
        String temp = "0";
	
	for(int i=0; i< 52; i++) {
	   target = (int) Math.floor(Math.random() * 52);
		  
		    if (target ==0) {
			  i--;
			  continue;
		     }
		  
		      temp = cards[0];
		    cards[0] = cards[target];
		    cards[target] = temp;
	    }
	 return cards;
}

public static String[] randomizeHand(String[] cards) {
	String[] hand = new String[5]; 
	int[] test = new int[5]; 
    System.out.println(" ");
	for(int i = 0; i<5; i++) {
		  int target = (int) Math.floor(Math.random() * 52);
		  hand[i] = cards[target];		
		  test[i] = target;
		  for (int j=0; j <i; j++) {
			  if (test[i] == test[i-1]) {
					  i--; break; 
			  }	 
		  }
	  } 	
	return hand;
}
	

}
			 

