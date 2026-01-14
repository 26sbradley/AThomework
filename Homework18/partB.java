import java.util.Scanner;

public class partB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int[] values = new int[20];
        int currentSize = 0;

          // Input loop
        while (currentSize < values.length) {
             System.out.print("Enter an integer value or 'q' to quit: ");
            if (in.hasNextInt()) {
                  values[currentSize] = in.nextInt();
                currentSize++;
                  } else if (in.hasNext("q") || in.hasNext("Q")) {
                in.next(); // skip 'q'
                break;
                  } else {
                in.next(); // skip invalid input
                System.out.println("Invalid input. Enter integer or 'q'.");
            }
        }
         // Print array
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize - 1) System.out.print(", ");
              }
        System.out.println();

        // Ask for target
        System.out.print("Enter a target integer value: ");
        int target = in.nextInt();

        // Count occurrences
          int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (values[i] == target) count++;
        }

        System.out.println("The value " + target + " occurs " + count + " times in your original data set.");
        in.close();
    }
}
