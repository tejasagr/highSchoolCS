public class BoxCars {
    public static void main (String[] args) {
        final int ROLLS = 1000;
        int BoxCars = 0, num1, num2;
        int count = 0;
        
        Die die1 = new Die();
        Die die2 = new Die();
        
        for (int roll = 1; roll <= ROLLS; roll++) {
            num1 = die1.roll();
            num2 = die2.roll();
            
            if (num1 == 6 && num2 == 6) {
                BoxCars++;
            }
        }
            
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of box cars: " + BoxCars);
        System.out.println("Ratio: " + (double)BoxCars/ROLLS);     
        
    }
}