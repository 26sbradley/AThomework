import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> temps = new ArrayList<>();
        Scanner input = new Scanner(new File("temps.txt"));

        int lowest = Integer.MAX_VALUE;

        while (input.hasNextInt()) {
            int temp = input.nextInt();
            temps.add(temp);

            if (temp < lowest) {
                lowest = temp;
            }
        }

        input.close();

        for (int temp : temps) {
            if (temp == lowest) {
                System.out.printf("%4d <= lowest%n", temp);
            } else {
                System.out.printf("%4d%n", temp);
            }
        }
    }
}