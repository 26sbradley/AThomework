import java.util.Scanner;

public class challenge04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a value 0-20: ");
        int value = in.nextInt();

        //Clamp the value between 0 and 20
        if (value < 0) value = 0;
        if (value > 20) value = 20;

       // The progress bar has 20 total slots
        int filled = value;          // number of '#' symbols
        int empty = 20 - value;      // number of '-' symbols

        // Build the bar using String.repeat()
        String bar = "[" + "#".repeat(filled) + "-".repeat(empty) + "]";

        // Convert value to a percent (value out of 20)
        int percent = (value * 100) / 20;

        // Display the progress bar and percentage  
        System.out.println("Progress: [" + bar + "] " + percent + "%");
    
    }
}
