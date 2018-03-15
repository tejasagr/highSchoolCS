import java.text.*;
//abstract class that is used in ColdDrink and HotDrink
abstract class Drink
{
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    double price;
    int stock;
    String name;

    public Drink(double p, int s, String n) {
        price = p;
        stock = s;
        name = n;
    }

    abstract String process ();

    // getPrice uses NumberFormat to format moneyString into correct currency format
    public String getPrice ()
    {
        String moneyString = formatter.format(price);
        return moneyString;

    }

    //Gets the price of drink
    public double getPriceNum ()
    {
        return price;

    }

    //adds num to stock and then returns stock
    public int changeStock(int num)
    {
        stock += num;
        return stock;
    }

    //Gets the name of drink
    public String getName()
    {
        return name;
    }

    //Gets the stock of drink
    public int getStock(){
        return stock;
    }
}