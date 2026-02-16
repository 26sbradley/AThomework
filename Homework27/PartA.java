import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {

        // Declare Scanner reference
        Scanner in;

        // Initialize Scanner using keyboard input
        in = new Scanner(System.in);

        // Get their name
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Name: " + name);

        // Get their age
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Age: " + age);

        in.close();
    }
}