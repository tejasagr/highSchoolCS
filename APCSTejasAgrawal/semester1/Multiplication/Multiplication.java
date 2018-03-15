import java.util.Scanner;

public class Multiplication {
    public static void main (String[] args) {
        
        System.out.println("***********************");
        
        System.out.println("MULTIPLICATION TABLES 1 TO 12");
        
        for (int num1 = 1; num1 <= 12; num1++) {
            
            System.out.print(num1+":\t");
            
            
            for (int num2 = 1; num2 <=12; num2++) {
                
                System.out.print(num1*num2+"\t");
                
            }
            System.out.println();
        }
        
        System.out.println("***********************");
        
        System.out.println();
        
    }
}