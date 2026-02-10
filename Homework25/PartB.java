import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        File file = new File("birthyears.txt");

        try {
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                String yearStr = parts[1];

                try {
                    int year = Integer.parseInt(yearStr);
                    System.out.println(name + " was born in " + year + ".");
                } catch (NumberFormatException e) {
                    System.out.println("I do not know what year " + name + " was born.");
                }
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}