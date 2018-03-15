//************************
//
// allows creation of card objects, which contain a random suit and random face
//
//************************





import java.util.Random; //allows RNG

public class Card {
    //this class is for each different card we use in our main method
    
    int suitNum, faceNum;                //declaration of necessary variables
    Random generator = new Random();     //random number generator

    public Card() {     //method generates random values for color and suit
        suitNum = generator.nextInt(4) + 1; //randomly assigns a number between 1-4 for the suit
        faceNum = generator.nextInt(13) + 1;//randomly assigns a number between 1-13 for the face
    }
    
    public String getSuit() {   //turns numerical value to string value for the suit
        String suitName = "";   //used for storing string that will be returned
        switch (suitNum) {      //switch statement assigns different string based on suitNum
            case 1:
            suitName = "Spades";
            break;
            
            case 2:
            suitName = "Hearts";
            break;
            
            case 3:
            suitName = "Clubs";
            break;
            
            case 4:
            suitName = "Diamonds";
            break;
        }
        return suitName;    //returns the string suitname
    }
    
    public String getFace() {   //turns numerical value to string value for the face
        String faceName = "";   //used for storing string that will be returned
        switch (faceNum) {      //switch statement assigns different string based on faceNum
            case 1:
            faceName = "Ace";
            break;
            
            case 2:
            faceName = "Two";
            break;
            
            case 3:
            faceName = "Three";
            break;
            
            case 4:
            faceName = "Four";
            break;
            
            case 5:
            faceName = "Five";
            break;
            
            case 6:
            faceName = "Six";
            break;
            
            case 7:
            faceName = "Seven";
            break;
            
            case 8:
            faceName = "Eight";
            break;
            
            case 9:
            faceName = "Nine";
            break;
            
            case 10:
            faceName = "Ten";
            break;
            
            case 11:
            faceName = "Jack";
            break;
            
            case 12:
            faceName = "Queen";
            break;
            
            case 13:
            faceName = "King";
            break;
        }
        return faceName;    //returns the string faceName
    }
    
    public String toString() {  //tells how the card object should be represented as a string value
        return getFace() + " of " + getSuit();  //the suit string, followed by of followed by face string
    }
}