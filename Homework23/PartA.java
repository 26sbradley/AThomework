import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("customerdata.txt"));

        // Use comma, whitespace, and newline as delimiters
        file.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name     |     Balance ");
        System.out.println("---------------------------------------");

        while (file.hasNext()) {
            int id = file.nextInt();
            String name = file.next();
            double balance = file.nextDouble();

            System.out.printf("%06d | %11s | $%12,.2f%n",
                    id, name, balance);
        }

        file.close();
    }
}