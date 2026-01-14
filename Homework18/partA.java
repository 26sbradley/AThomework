import java.util.Arrays;
import java.util.Scanner;

public class partA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] values = new int[10];
        int currentSize = 0;

        System.out.println("Enter up to 10 integers (type 'q' to stop):");
        while (currentSize < values.length) {   // removed semicolon
            System.out.print("Value " + (currentSize + 1) + ": ");
            
            if (in.hasNextInt()) {
                values[currentSize] = in.nextInt();
                currentSize++;
            } else if (in.hasNext("q") || in.hasNext("Q")) {
                in.next(); // consume 'q'
                break;     // exit loop
            } else {
                System.out.println("Invalid input. Please enter an integer or 'q' to stop.");
                in.next(); // consume invalid input
            }
        }

        // Print original array with asterisks
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        // Sort only the valid portion of the array
        Arrays.sort(values, 0, currentSize);

        // Print in reverse order, separated by commas
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i > 0) System.out.print(",");
        }
        System.out.println();

        in.close();
    }
}