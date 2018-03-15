/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks  = {
                "King","Queen","Jack","Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace",
                "King","Queen","Jack","Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace",
                "King","Queen","Jack","Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace",
                "King","Queen","Jack","Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"
            };

        String[] suits  = {
                "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades",
                "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", 

                "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", 
                "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", 

                "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs",
                "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", 

                "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds",
                "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds"
            };

        int[]    values = {
                10,10,10,10,9,8,7,6,5,4,3,2,11,
                10,10,10,10,9,8,7,6,5,4,3,2,11,
                10,10,10,10,9,8,7,6,5,4,3,2,11,
                10,10,10,10,9,8,7,6,5,4,3,2,11
            };

        Deck cards = new Deck(ranks, suits, values);

        System.out.println("First card dealt: " + cards.deal());
        System.out.println("-------------------------");
        System.out.println("Is deck empty? " + cards.isEmpty());
        System.out.println("-------------------------");
        System.out.println("Deck status below");
        System.out.println(cards);
        System.out.println("-------------------------");

        System.out.println("Second card dealt: "+ cards.deal());
        System.out.println("Third card dealt: "+ cards.deal());
        System.out.println("-------------------------");
        System.out.println("Is deck empty now? " + cards.isEmpty());
        System.out.println("-------------------------");
        System.out.println("Deck status below");
        System.out.println(cards);
    }
}
