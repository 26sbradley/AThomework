import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for interest rate and starting balance
        System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
        double apr = input.nextDouble();
        System.out.print("Enter the balance: ");
        double balance = input.nextDouble();

        // Convert APR from percent to decimal
        double rate = apr / 100.0;

        // Print the table header
        System.out.println("Year |        Int Earned ($)       |           Balance ($)");
        System.out.println("----------------------------------------------------------------------");

        // Use a for loop to calculate interest for 5 years
        for (int year = 1; year <= 5; year++) {
            double interest = balance * rate;  // calculate this year's interest
            balance += interest;               // add interest to balance

            // formatted output for nice alignment
            System.out.printf("%3d  | %25.2f | %28.2f%n", year, interest, balance);
        }
    }
}