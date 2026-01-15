import java.util.Scanner;

public class partA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] phrase = new String[10];
        int currentSize = 0;

        while (currentSize < phrase.length) {
            System.out.print("Enter a phrase (or 'q' to stop): ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            phrase[currentSize] = input;
            currentSize++;
        }

        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        for (int i = 0; i < currentSize; i++) {
            System.out.println("  " + phrase[i]);
        }

        cleanup(phrase, currentSize);

        System.out.println("Modified array: ");
        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        for (int i = 0; i < currentSize; i++) {
            System.out.println("  " + phrase[i]);
        }

        in.close();
    }

    public static void cleanup(String[] array, int size) {
        for (int i = 0; i < size; i++) {
            String s = array[i].trim().toLowerCase();

            if (s.length() > 0) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
            }

            array[i] = s;
        }
    }
}