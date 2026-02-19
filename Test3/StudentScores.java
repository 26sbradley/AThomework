import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("students.txt"));

        double sum = 0;
        int count = 0;

        System.out.println("Name         |       School      |      Score");
        System.out.println("---------------------------------------------");

        while (file.hasNextLine()) {

            String line = file.nextLine();
            String[] parts = line.split(",");

            String name = parts[0].trim();
            String school = parts[1].trim();
            double score = Double.parseDouble(parts[2].trim());

            System.out.printf("%-12s | %-18s | %5.1f\n", name, school, score);

            sum += score;
            count++;
        }

        System.out.println("---------------------------------------------");

        double average = sum / count;
        System.out.printf("Average Score: %.1f\n", average);

        file.close();
    }
}


