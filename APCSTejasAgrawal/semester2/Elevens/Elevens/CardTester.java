/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        //King of Spades
        Card card1 = new Card("King", "Spades", 13);

        System.out.println("-----------------------------------");
        System.out.println("Suit: \t" + card1.suit());
        System.out.println("Rank: \t" + card1.rank());
        System.out.println("Value: \t" + card1.pointValue());
        System.out.println();
        System.out.println(card1);
        System.out.println("-----------------------------------");

        //Jack of Diamonds
        Card card2 = new Card("King", "Spades", 13);

        System.out.println("Suit: \t" + card2.suit());
        System.out.println("Rank: \t" + card2.rank());
        System.out.println("Value: \t" + card2.pointValue());
        System.out.println();
        System.out.println(card2);
        System.out.println("-----------------------------------");

        //Four of Hearts
        Card card3 = new Card("Four", "Hearts", 4);

        System.out.println("Suit: \t" + card3.suit());
        System.out.println("Rank: \t" + card3.rank());
        System.out.println("Value: \t" + card3.pointValue());
        System.out.println();
        System.out.println(card3);
        System.out.println("-----------------------------------");
        
        //comparisons
        if (card1.matches(card2)) {     //cards 1 and 2
            System.out.println(card1 + " is equal to " + card2);
        }
        else {
            System.out.println(card1 + " isn't equal to " + card2);
        }
        
        if (card1.matches(card3)) {     //cards 1 and 3
            System.out.println(card1 + " is equal to " + card3);
        }
        else {
            System.out.println(card1 + " isn't equal to " + card3);
        }
        
        if (card2.matches(card3)) {     //cards 2 and 3
            System.out.println(card2 + " is equal to " + card3);
        }
        else {
            System.out.println(card2 + " isn't equal to " + card3);
        }
        
        System.out.println("-----------------------------------");
    }
}