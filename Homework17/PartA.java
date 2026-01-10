public class PartA {
    public static void main(String[] args) {

        double[] scores = { 10.5, 20.0, 30.5, 40.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
        int currentSize = 4;

        System.out.print("Before: ");
        printArray(scores, currentSize);

        currentSize = insert(scores, currentSize, 2, 99.5);

        System.out.print("After: ");
        printArray(scores, currentSize);
    }

    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        if (currentSize >= array.length) {
            return currentSize;
        }

        if (targetIndex < 0 || targetIndex > currentSize) {
            return currentSize;
        }

        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        array[targetIndex] = newElement;
        return currentSize + 1;
    }

    public static void printArray(double[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}