import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<>();

        while (true) {
            System.out.print("Enter a temperature or 'q' to quit: ");

            if (input.hasNextInt()) {
                temps.add(input.nextInt());
            } else if (input.hasNext("q")) {
                input.next();
                break;
            } else {
                input.next();
            }
        }

        int lowest = temps.get(0);
        for (int temp : temps) {
            if (temp < lowest) {
                lowest = temp;
            }
        }

        System.out.println("\nTemperatures:");
        for (int temp : temps) {
            if (temp == lowest) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }

        input.close();
    }
}