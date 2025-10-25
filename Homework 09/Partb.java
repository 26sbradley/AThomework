import java.util.Scanner;

public class Partb {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter two floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //Round the numbers
        num1 = Math.round(num1 * 100.0) / 100.0;
        num2 = Math.round(num2 * 100.0) / 100.0;

        //Compare the numbers and display result
         if (num1 == num2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
     }       
}
