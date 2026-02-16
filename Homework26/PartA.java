import java.util.Scanner;

public class PartA {

    public static int getQuizScore(Scanner in) {
        String input = in.nextLine();

        int score;

        try {
            score = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format.");
        }

        if (score < 0 || score > 100) {
            throw new NumberFormatException("Score out of valid range (0–100).");
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a quiz score (0-100): ");

        try {
            int score = getQuizScore(in);
            System.out.println("Valid quiz score entered: " + score);
        } catch (NumberFormatException e) {
            System.out.println("Invalid quiz score.");
        }

        in.close();
    }
}