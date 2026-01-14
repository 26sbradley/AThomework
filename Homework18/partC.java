import java.util.Arrays;
import java.util.Random;

public class partC {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 10000;
        int[] arr = new int[size];

        // Fill array with random integers 1 to size
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(size) + 1;
        }

        // Sort array for binary search
        Arrays.sort(arr);

        System.out.println("Testing linear search vs binary search on 10 random targets...");

        for (int i = 0; i < 10; i++) {
            int target = rand.nextInt(size) + 1;

            // Linear search
            long startLinear = System.nanoTime();
            int idxLinear = linearSearch(arr, target);
            long endLinear = System.nanoTime();

            // Binary search
            long startBinary = System.nanoTime();
            int idxBinary = Arrays.binarySearch(arr, target);
            long endBinary = System.nanoTime();

            System.out.println("Target: " + target);
            System.out.println("Linear search found at index: " + idxLinear + " in " + (endLinear - startLinear) + " ns");
            System.out.println("Binary search found at index: " + idxBinary + " in " + (endBinary - startBinary) + " ns");
            System.out.println("-----------------------------");
        }
    }

    // Linear search method
    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) return i;
        }
        return -1; // not found
    }
}
