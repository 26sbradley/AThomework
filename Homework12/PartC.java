import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius of the sphere
        System.out.print("Enter radius of the sphere: ");
        double radius = input.nextDouble();

        // Calculate the volume of the sphere
        double volume = sphereVolume(radius);

        // Output the volume of the sphere
        System.out.println("The voume of the sphere is: " + volume);

    }
    // Method to calculate the volume of a sphere given its radius
    public static double sphereVolume(double r) {

        // Volume formula for a sphere: (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }
}