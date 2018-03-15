import java.util.Scanner;

public class CharacterPrinter {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int length;
        
        System.out.print("Enter your string: ");
        input = scan.nextLine();
        
        length = input.length();
        
        for (int characterplace = 0; characterplace < length; characterplace++) {
            System.out.println(input.charAt(characterplace));
            
        }
    }
}