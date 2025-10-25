import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for GPA
        System.out.print("Enter a number between 0.0 and 4.0: ");
        double gpa = input.nextDouble();

        String grade; // variable to store letter grade

        // Compare to closest value
        if (gpa >= 3.95) {
            grade = "A+";
        } else if (gpa >= 3.8) {
            grade = "A";
        } else if (gpa >= 3.5) {
            grade = "A-";
        } else if (gpa >= 3.15) {
            grade = "B+";
        } else if (gpa >= 2.85) {
            grade = "B";
        } else if (gpa >= 2.5) {
            grade = "B-";
        } else if (gpa >= 2.15) {
            grade = "C+";
        } else if (gpa >= 1.85) {
            grade = "C";
        } else if (gpa >= 1.5) {
            grade = "C-";
        } else if (gpa >= 1.15) {
            grade = "D+";
        } else if (gpa >= 0.85) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.printf("A value of %.2f corresponds to a grade of %s.%n", gpa, grade);
    }
}
