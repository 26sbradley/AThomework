import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter an integer or 'q' to quit: ");

            if (input.hasNextInt()) {
                numbers.add(input.nextInt());
            } else if (input.hasNext("q")) {
                input.next();
                break;
            } else {
                input.next();
            }
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }

        System.out.println("\nModified list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        input.close();
    }
}