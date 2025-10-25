import java.util.Scanner;

public class PartA {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for temperature and unit
        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit12 F: ");
        double temperature = input.nextDouble();
        char unit = input.next().toUpperCase().charAt(0); // Read 'C' or 'F'

        // Convert Fahrenheit to Celsius if needed
        if (unit == 'F') {
            temperature = (temperature - 32) * 5 / 9;
        }
    

    // Determine water state
        String state;
        if (temperature <= 0) {
            state = "solid (ice)";
        } else if (temperature >= 100) {
            state = "gaseous (steam)";
        } else {
            state = "liquid";
        }

        System.out.printf("At a temperature of %.2f %c, water is in a %s state.%n", 
         (unit == 'C' ? temperature : (temperature * 9 / 5) + 32), unit, state);
    }
}
