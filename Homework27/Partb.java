import java.util.Scanner;

public class Partb {

    // Counter class inside same file
    static class Counter {
        private int count;

        public Counter() {
            count = 0;
        }

        public void click() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Create counters
        Counter cake = new Counter();
        Counter pie = new Counter();

        System.out.println("Enter 'c' for cake, 'p' for pie, or 'q' to quit:");

        while (true) {
            System.out.print("Your choice: ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            } 
            else if (input.equalsIgnoreCase("c")) {
                cake.click();
            } 
            else if (input.equalsIgnoreCase("p")) {
                pie.click();
            } 
            else {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("\nResults:");
        System.out.println("Cake votes: " + cake.getCount());
        System.out.println("Pie votes: " + pie.getCount());

        in.close();
    }
}