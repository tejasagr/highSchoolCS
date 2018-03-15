public class TwentyOneDeck {
    public static void main (String[] args) {
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
        
        Deck d = new Deck(ranks, suits, values);
        
        System.out.println(d);
    }
}