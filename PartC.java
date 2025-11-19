import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        //Here is problem one where the sum was incorrectly calculated
        // before I fixed it, the code read: int sum = num1 - num2;
        //But it actually had to be as follows:
        int sum = num1 + num2;

        //Here is problem two, where average used integer dividion
        // As supposed to double division
        // Before I fixed it, the code read: double average = sum / 2;
        //But it actually had to be as follows:
        double average = sum / 2.0;

        //Here is problem three, where the larger number logic was written backwads
        // before I fixed it, the code read: int larger = (num1 < num2) ? num1 : num2;
        //But it actually had to be as follows:
        int larger = (num1 > num2) ? num1 : num2;

        //Finally, here is problem 4, where the print statemens were misslabeled
        // before I fixed it, the code read: System.out.println("Smaller: " + larger);
        //But it actually had to be as follows:
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Larger = " + larger);



    }
}