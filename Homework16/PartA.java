import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Allows it to hold up to 10 scores
        double[] scores = new double[10];

        int count = 0;
        double max = 0.0;
        double sum = 0.0;

        System.out.println("Enter test scores (or 'q' to quit):");

        while (count < scores.length) {
            System.out.print("Score " + (count + 1) + ": ");

            if (in.hasNextDouble()) {
                double score = in.nextDouble();
                scores[count] = score;
                sum += score;

                if (count == 0 || score > max) {
                    max = score;
                }

                count++;
            } else {
                String input = in.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid score or 'q' to quit.");
                }
            }
        }

        // Results (AFTER loop)
        if (count > 0) {
            double average = sum / count;
            System.out.println("\nNumber of scores entered: " + count);
            System.out.println("Average score: " + average);
            System.out.println("Maximum score: " + max);
        } else {
            System.out.println("No scores were entered.");
        }

        in.close();
    }
}