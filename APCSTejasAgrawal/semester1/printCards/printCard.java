//*************************************************
// By:      Tejas Agrawal
// Date:    19/11/15
// Name:    Card Printer
// Lesson 6:Programming Project
//*************************************************

public class printCard { //class for card printing
    public static void main (String[] args) { //this method creates 20 random card objects and prints them
        final int LIMIT = 20;       //limit is how many cards we want to print, 20 in this case
        
        for (int i = 1; i <= LIMIT; i++) { //loop will run 20 times (1-20)
            System.out.println(new Card()); //prints out a new card object every time, in string form
        }
    }
}