import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        double sum = 0;

        while (true) {
            System.out.print("Enter a test score or 'q' to quit: ");

            if (input.hasNextDouble()) {
                double score = input.nextDouble();
                scores.add(score);
                sum += score;
            } else if (input.hasNext("q")) {
                input.next();
                break;
            } else {
                input.next();
            }
        }

        System.out.println("\nScores:");
        for (double score : scores) {
            System.out.printf("%.2f%n", score);
        }

        double average = sum / scores.size();
        System.out.printf("Average: %.2f%n", average);

        input.close();
    }
}