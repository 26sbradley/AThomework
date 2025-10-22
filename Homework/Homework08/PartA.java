import java.util.Scanner;

public class PartA {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask if it's Monday
        System.out.print("Is it Monday? (yes or no): ");
        String isMonday = input.nextLine().toLowerCase();

        // Ask for age and meal cost
        System.out.print("Enter the customer's age: ");
        int age = input.nextInt();

        System.out.print("Enter the cost of the meal: ");
        double cost = input.nextDouble();

        double discountRate = 0.0;

        // Determine discount based on age and day
        if (isMonday.equals("yes")) {
            if (age < 13) {
                discountRate = 0.075;
            } else if (age >= 50) {
                discountRate = 0.15;
            } else {
                discountRate = 0.05;
            }
        } else {
            if (age < 13) {
                discountRate = 0.05;
            } else if (age >= 50) {
                discountRate = 0.075;
            }
        }

        double discountedCost = cost - (cost * discountRate);

        // Display the results
        System.out.printf("Original cost: $%.2f%n", cost);
        System.out.printf("Discount applied: %.1f%%%n", discountRate * 100);
        System.out.printf("Discounted cost: $%.2f%n", discountedCost);

        
    }
}

