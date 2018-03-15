import java.util.Scanner;
public class driver {

    public static void main() {
        //instantiates two different scanners and different drinks to later input into ArrayList.
        Scanner scan = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        Drink cola = new ColdDrink(5.99, 7, "Coca Cola");
        Drink cocoa = new HotDrink(8.99, 11, "Hot Chocolate"); 
        Drink tea   = new ColdDrink(4, 2, "Ice Lemon Tea");

        //instantiates variable v with VendingMachine type
        VendingMachine v = new VendingMachine();

        //adds drinks to ArrayList drinks
        v.addDrink(cola);
        v.addDrink(cocoa);
        v.addDrink(tea);
        // Displays the drinks in string format to user
        v.display();
        //boolean is used to stop program
        boolean cont = true;
        int identity = 1;
        int id = 0;
        int amnt = 0;

        
        while (cont == true)
        {
            v.display();
            //Program asks user if they are trying to change the vending machine or use it
            System.out.println ("Are you a Customer or Repairer (1 for customer, 2 for Repairer"
                + " any other number for ending");
            identity = scan.nextInt ();

            //if input is 1, the program will go into the customer part of the program asking what they
            //would like to buy, the quantity, and the price
            if (identity == 1)
            {
                System.out.println ("What would you like to buy? (Enter the id)");
                id = scan.nextInt();
                System.out.println ("How many would you like?");
                amnt = scan.nextInt ();
                double p = v.changeStock (id, amnt*-1); //price
                System.out.println ("It will cost " + p + " dollars and the drink is now being " 
                    + v.process(id));

            }
            //if input is 2, the program will go into the repairer part of the program
            else if (identity == 2)
            {
                System.out.println ("What would you like to do? (1 for items, 2 for stocks)");
                int what = scan.nextInt();
                //if user inputs 1, the program asks if they want to delete or add.
                if (what == 1)
                {
                    System.out.println ("Would you like to add (1) or delete (2) items?");
                    what = scan.nextInt();
                    if (what == 1)
                    //if user inputs 1, the program will ask name, price, stock, and if it’s hot or cold and then add 
                    //it to the ArrayList drinks
                    {
                        System.out.println ("What is the name of the item?");
                        String name = scan2.nextLine();
                        System.out.println ("How many stocks are there?");
                        int stock = scan.nextInt();
                        System.out.println ("What is the price?");
                        int price = scan.nextInt();
                        System.out.println ("Is it hot(1) or Cold(2)");
                        what = scan.nextInt();
                        //If user inputs 1, it will add a new HotDrink to ArrayList drinks
                        if (what == 1)
                        {
                            v.addDrink(new HotDrink(price, stock, "Hot " + name));
                        }
                        // If user inputs 2, it will add a new ColdDrink to ArrayList drinks
                        if (what == 2)
                        {
                            v.addDrink(new ColdDrink(price, stock, "Cold " + name));
                        }
                    }
                    //If user inputs 2, it will ask what item to delete and remove wanted item from ArrayList drinks
                    else if (what == 2)
                    {
                        System.out.println ("What Item would you like to delete? (Enter the id)");
                        id = scan.nextInt();
                        v.removeDrink(id);
                    }
                }
                //If user inputs 2, the program will ask the user which item they would like to change
                //and then ask the user how many they would like to add or subtract
                else if (what == 2)
                {
                    System.out.println ("What would you like to change? (Enter the id)");
                    id = scan.nextInt();
                    System.out.println ("How many would you want add/subtract"
                        + "(indicate by positive and negative number)");
                    amnt = scan.nextInt();
                    v.changeStock (id, amnt); 
                }

            }
            else 
            {
                cont = false;
            }
        }
    }
}