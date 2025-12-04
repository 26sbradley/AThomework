import java.util.Random;

public class challenge02 {
    public static void main(String[] args) {
        Random rand = new Random (); 
        
        int d1;
        int d2;

        do {
            d1 = rand.nextInt(6) + 1; // Roll first die (1-6)
            d2 = rand.nextInt(6) + 1; // Roll second die (1-6)

            System.out.println("Die 1: " + d1);
            System.out.println("Die 2: " + d2);
            System.out.println();
        } while (d1 != d2); // This will allow the loop to continue until both dice show the same number

        System.out.println("You rolled a double! Congrats you won! The game is now over.");

    }

}

