import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a filename or # to quit: ");
            String filename = in.nextLine();

            if (filename.equals("#")) {
                System.out.println("Goodbye.");
                break;
            }

            File file = new File(filename);

            if (!file.exists()) {
                System.out.println("Error: File not found.");
                continue;
            }

            try {
                Scanner fileIn = new Scanner(file);
                while (fileIn.hasNext()) {
                    System.out.println(fileIn.next());
                }
                fileIn.close();
                break; // end program after successful read
            } catch (FileNotFoundException e) {
                System.out.println("Error opening file.");
            }
        }

        in.close();
    }
}