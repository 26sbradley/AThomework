import java.util.Scanner;

public class PartB {

      enum CustomerType {
        CHILD, ADULT, SENIOR
    }

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

        // Determine the customer type
        CustomerType type;
        if (age < 13) {
            type = CustomerType.CHILD;
        } else if (age >= 50) {
            type = CustomerType.SENIOR;
        } else {
            type = CustomerType.ADULT;
        }

        // Determine discount based on type and day
        double discountRate = 0.0;

        if (isMonday.equals("yes")) {
            switch (type) {
                case CHILD:
                    discountRate = 0.075;
                    break;
                case SENIOR:
                    discountRate = 0.15;
                    break;
                default:
                    discountRate = 0.05;
            }
        } else { 
            switch (type) {
                case CHILD:
                    discountRate = 0.05;
                    break;
                case SENIOR:
                    discountRate = 0.075;
                    break;
                default:
                    discountRate = 0.0;
            }
        }

        // Display the results
        double discountedCost = cost - (cost * discountRate);

        System.out.println("Customer type: " + type);
        System.out.printf("Original cost: $%.2f%n", cost);
        System.out.printf("Discount applied: %.1f%%%n", discountRate * 100);
        System.out.printf("Discounted cost: $%.2f%n", discountedCost);

        
    }
}



