import java.util.*;

public class VendingMachine {
    //instantiates an ArrayList Drink from abstract class Drink
    List<Drink> drinks = new ArrayList<Drink>();

    // A method that is called to display all drinks available in a program by using a for loop that goes //through the ArrayList drinks
    public void display ()
    {
        System.out.println("Number:\tName: \t\tStock: \tPrice:");

        for (int i = 0; i < drinks.size(); i ++)
        {
            Drink d = drinks.get(i);
            System.out.println(i + "\t" + d.getName() + "\t" +  d.getStock() + "\t" + d.getPrice());
        }
    }

    //A method that is used to add another Drink into the ArrayList drinks  just in case the ‘vending
    // machine’ starts stocking more drinks
    public void addDrink(Drink d) {
        //Adds new Drink to ArrayList drinks  
        drinks.add(d);

    }

    //A method that is used to remove Drinks from the ArrayList drinks just in case the ‘vending
    // machine’ wants to remove a certain drink
    public void removeDrink(int index) {
        drinks.remove(index);

    }

    //returns the String of ArrayList Drink where int index is the index of the element in the ArrayList drinks
    public String process(int index) {
        return (drinks.get(index)).process();
    }



    public double changeStock(int index, int amount) {    //negative will remove, positive will add
        //checks to see if int index is a valid value when checking for a certain element in ArrayList drinks
        //if it isn’t, the method will return 0.
        if (index < 0 || index > drinks.size()-1) {
            System.out.println("Error");
            return 0;
        }

        //instantiates a variable type drink that gets the string of ArrayList drinks where int index is the index of the wanted String
        Drink d = drinks.get(index);

        //If the current stock and the amount of stock added is less than zero, the program will add the index’s number of stock to the current stock and multiply it by d.getStock
        if (d.getStock() + amount < 0)
        {
            d.changeStock(d.getStock());
            return d.getPriceNum() * d.getStock();
        }
        //if the current stock and the amount of stock added is more than zero, the program will add the the integer amount to the current amount and multiply the price of the ArrayList drinks index by the amount
        d.changeStock(amount);
        return d.getPriceNum() * amount;
    }

}