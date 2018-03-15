import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int year, ans; //ans = 1 will be to represent yes, ans 0 will be error, ans -1 will be not a leap year
        
        System.out.println("****************************************************");
        System.out.println("This program will check and tell you if a year is a leap year or not.");

        System.out.print("Please enter a year number (The year should be a year from 1582 onwards): ");
        year = scan.nextInt();

        System.out.println("----------------------------------------------------");
        
        //we will first decide if the year is a leap year and store the answer in the 'ans' value
        
        if ( year >= 1582) {
            //make sure the year is 1582 or after
            
            if ( year % 4 == 0) {
                //code if the year is divisible by four
                
                if ( year % 400 ==0) {
                    //if the year is divisisble by 4, 100 and 400
                    ans = 1;
                }
                
                else {
                    //if the year is divisible by 4, but not by 400
                    if ( year % 100 != 0 ) {
                        //if the year is divisible by 4, but not by 100 and 400
                        ans = 1;
                        
                    }
                    
                    else {
                        //if the year is divisible by 4 and a 100 but not 400
                        ans = -1;
                        
                    }
                }
            }
            
            else {
                //if the year isn't divisible by four
                ans = -1;
            }
        }
        
        else {
            //code if it is before 1852
            ans = 0;
        }
        
        
        
        //now that we have collected the ans value, we will display the answer
        
        if (ans == 1) {
            //if it is a leap year
            System.out.println(year + " is a leap year!");
        }
        
        else {
            //if it isn't a leap year or the year is 1582 or before
            
            if (ans == -1) {
                //if it isn't a leap year
                System.out.println(year + " isn't a leap year, sorry.");
            }
            
            else {
                //error because 1582 or before
                System.out.println("Error. " + year + " is before the year 1582.\nThis is before the " +
                "Gregorian calender was adopted, sorry.");
                
            }
        }
        
        System.out.println("****************************************************");
        System.out.println();
    }
}