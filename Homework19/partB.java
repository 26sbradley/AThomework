import java.util.Arrays;

public class partB {
     public static void main(String[] args) {

        System.out.println("Average of 10, 8, 9 = " + average(10, 8, 9));

         double[] scores = {100, 90, 80, 100, 80};
        System.out.println("Average of scores array = " + average(scores));

        
    
}
public static double average(double... values) {
        double sum = 0.0;
        for (double v : values) {
            sum += v;
        }

        return sum / values.length;
    }
}

