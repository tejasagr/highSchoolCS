import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, guess, guessnum, play = 1;
        System.out.println("*****************************************");
        
        //whole game loop
        while (play==1) {
            guessnum = 0; //resets the number of guesses
            
            System.out.println("----");
            System.out.println("Let's start a game of Hi-Lo. Enter 0 at anytime during the game to quit.");
            
            Random generator = new Random();
            number = generator.nextInt(100) + 1;    //we have our number
            
            System.out.print("I have chosen a number from 1 to 100. Take a guess: ");
            guess = scan.nextInt(); //initial guess
            guessnum++; //initial guess gets counted
            
            //guessing process
            while (guess != number && guess !=0 ) { //stopped by win or quit
                System.out.print("Sorry, that's not it. Your number was too ");
                
                if (guess > number) {
                    System.out.println("high.");
                }
                
                else {
                    System.out.println("low.");
                }
                
                System.out.print("Enter another guess: ");
                guess = scan.nextInt();
                guessnum++;
                
            }
            
            System.out.println();
            
            //displaying answer and guesses
            if (guess==number) {
                System.out.println("Great job! The number was " + number + ", and it only took you " +
                guessnum + " guess(es)!");
            }
            
            else {
                guessnum--; //not counting quit command as a guess
                System.out.println("Sad to see you quit! The number was " + number + ", and you quit after " +
                guessnum + " guess(es)...");
            }

            System.out.println();
            
            System.out.print("Another game? Enter 1 for yes and 0 for no: ");
            play = scan.nextInt();
        }
        System.out.println();
        
        System.out.println("Ok! Thanks for playing.");
        System.out.println("*****************************************");
        System.out.println();
    }
}