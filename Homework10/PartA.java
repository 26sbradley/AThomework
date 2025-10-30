public class PartA {
    public static void main(String[] args) {

        double amount = 100.0;  // start with 100% of the material
        int years = 0;          // track total years

        // loop until 99% has decayed (so only 1% or less remains)
        while (amount > 1.0) {
            amount = amount / 2;   // half-life decay
            years += 30;           // add 30 years each cycle
        }

        // print the result
        System.out.printf("After %d years, %.5f%% of the original cesium remains.%n", years, amount);
    }
}