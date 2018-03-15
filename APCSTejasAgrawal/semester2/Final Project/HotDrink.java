public class HotDrink extends Drink {
    public HotDrink(double p, int s, String n) {
        super(p, s, n);
    }

    // the method process returns “heated”
    public String process () {
        return "heated";
    }
}