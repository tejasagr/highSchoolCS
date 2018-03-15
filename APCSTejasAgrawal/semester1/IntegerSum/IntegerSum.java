import java.util.Scanner;

public class IntegerSum {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, count , sum = 0;
        
        System.out.print("Please enter an integer greater than or equal to 2: ");
        input = scan.nextInt();
        count = input;
        
        if (count >= 2) {
            while (count >= 2) {
                sum += count;
                count--;
            }
            
            System.out.println("The sum of all numbers between 2 and " + input + ", inclusive, is " + sum + ".");
        }
        
        else {
            System.out.println("Error. " + count + " is less than 2.");
        }
        
        
        System.out.println();
    }
}