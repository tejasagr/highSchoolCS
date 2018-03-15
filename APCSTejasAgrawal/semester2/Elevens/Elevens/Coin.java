import java.util.Random;

public class Coin {

    public static void main (String[] args) {
        Coin coin1 = new Coin();
        int heads = 0;

        System.out.println("---------------");
        for (int i = 1; i < 10; i++) {
            String result = coin1.flip();
            
            if (result == "Heads") {
                heads++;
            }
            
            System.out.println("Run #" + i + ": " + result);
            
            
        }
        System.out.println("Heads: " + heads + "/9");
        System.out.println("---------------");

    }

    public static String flip() {

        Random generator = new Random();
        int RNG = generator.nextInt(3);

        if (RNG <= 1) {
            return "Heads";
        }

        else {
            return "Tails";
        }
    }
}