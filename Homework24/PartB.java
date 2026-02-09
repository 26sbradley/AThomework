import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("sales.txt"));
        file.useDelimiter(",\\s*|\\n");

        while (file.hasNext()) {
            String dept = file.next();
            String manager = file.next();
            String revenueStr = file.next();

            double revenue;
            if (revenueStr.equalsIgnoreCase("n/a")) {
                revenue = 0.0;
            } else {
                revenue = Double.parseDouble(revenueStr);
            }

            System.out.printf(
                "%-18s | %-10s | $%9.2f%n",
                dept, manager, revenue
            );
        }

        file.close();
    }
}