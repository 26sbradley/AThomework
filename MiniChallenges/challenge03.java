import java.util.Scanner;

public class challenge03 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 

       System.out.print("Enter an integer: " );
       int x = in.nextInt();

       if (x<= 1) {
        System.out.println("This intiger is not prime.");
        return;
       }

       boolean prime = true;

       //For this part, I only need to check up to the square root of x
         for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                prime = false;
                break;
            }
         }

         if (prime) {
            System.out.println("This integer is prime.");
            } else {
                System.out.println("This integer is not prime.");
         }

    }
}
