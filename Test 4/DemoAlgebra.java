import java.util.Scanner;
import org.derryfield.math.Algebra;

public class DemoAlgebra {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter first value: ");
            double x = in.nextDouble();

            System.out.print("Enter second value: ");
            double y = in.nextDouble();

            double result = Algebra.harmonicMean(x, y);

            System.out.println("Harmonic Mean = " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        in.close();
    }
}