import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("characters.txt"));

        int count = 0;
        int letters = 0;
        int digits = 0;

        file.useDelimiter("");

        while (file.hasNext()) {
            char c = file.next().charAt(0);
            System.out.print(c);

            count++;

            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            }
        }

        file.close();

        System.out.println();
        System.out.println("count = " + count);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}