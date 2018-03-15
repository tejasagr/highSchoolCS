//********************************
// Miles Per Gallon Calculator
// Tejas Agrawal
// September 2015
// Lesson 3 Project
//********************************

import java.util.Scanner;           //Scanner class for keyboard input
import java.text.NumberFormat;      //NumberFormat class for currency format
import java.text.DecimalFormat;     //DecimalFormat for decimal place rounding

public class mpg {
    
    // The method will calculate and display miles per gallon, total trip cost, and distance travelled once the user
    // inputs the cost per gallon of gasoline, total gasoline used and the before and after odometer readings
    
    public static void main(String[] args) {
        double distanceInit, distanceFinal, totalGas, costpergal;  //doubles declared for all inputs
        double distanceTrav, totalCost, milespergal;               //doubles declared for all calculated values
        Scanner scan = new Scanner(System.in);                     //allows user keyboard input
        
        
        //user inputs
        System.out.print("Enter the initial odometer reading:\t");     //initial odometer
        distanceInit  = scan.nextDouble();
        
        System.out.print("Enter the final odometer reading:\t");       //final odometer
        distanceFinal = scan.nextDouble();
        
        System.out.print("Enter the total gasoline used:\t\t");        //total gas used
        totalGas      = scan.nextDouble();
        
        System.out.print("Enter the cost per gallon of gasoline:\t");  //cost per gallon of gas
        costpergal    = scan.nextDouble();
        
        System.out.println();                                          //allows for space between input & output
        
        
        //calculations
        distanceTrav = distanceFinal - distanceInit; //distance travelled = final distance - initial distance
        totalCost = totalGas * costpergal;           //total cost = total gasoline used * price per gallon
        milespergal = distanceTrav / totalGas;       //miles per gallon = distance travelled / total gasoline used
        
        
        //rounding
        NumberFormat money = NumberFormat.getCurrencyInstance(); //for formatting totalCost double
        DecimalFormat fmt = new DecimalFormat("0.##");           //for formatting other values to 2 decimals
        
        
        //displaying all the data calculated above
        System.out.println("****************************************************************");
        System.out.println("You have spent " + money.format(totalCost) + " to travel " + fmt.format(distanceTrav)
        + " miles.");
        System.out.println("Your miles per gallon would be " + fmt.format(milespergal) + " .");
        System.out.println("****************************************************************");
    }
}