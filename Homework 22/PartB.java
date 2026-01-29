import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("quizzes.txt"));
        PrintWriter output = new PrintWriter("quizzesMod.txt");

        int count = 0;
        double sum = 0.0;

        while (input.hasNextDouble()) {
            double score = input.nextDouble();
            sum += score;

            output.printf("Quiz %03d: %6.2f%n", count, score);
            count++;
        }

        double average = sum / count;

        output.println("----------------");
        output.printf("Average:   %6.2f%n", average);

        input.close();
        output.close();
    }
}