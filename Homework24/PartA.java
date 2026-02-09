import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("unemployment.txt"));
        file.useDelimiter(",\\s*|\\n");

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (file.hasNext()) {
            String country = file.next();
            double rate = file.nextDouble();
            int rank = file.nextInt();
            String region = file.next();

            System.out.printf(
                "Ranked # %2d: %-16s | %6.2f%% | %-22s%n",
                rank, country, rate, region
            );
        }

        System.out.println("---------------------------------------------------------------");
        file.close();
    }
}