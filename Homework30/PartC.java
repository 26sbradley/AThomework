public class PartC {

    private int value;

    // Default constructor
    public PartC() {
        value = 1;
    }

    // Overloaded constructor
    public PartC(int initialValue) {
        value = initialValue;
    }

    // Roll the die
    public void roll() {
        value = (int)(Math.random() * 6) + 1;
    }

    // Return current value
    public int getValue() {
        return value;
    }

    // Display ASCII die
    public void display() {

        System.out.println("+-------+");

        switch(value) {

            case 1:
                System.out.println("|       |");
                System.out.println("|   0   |");
                System.out.println("|       |");
                break;

            case 2:
                System.out.println("| 0     |");
                System.out.println("|       |");
                System.out.println("|     0 |");
                break;

            case 3:
                System.out.println("| 0     |");
                System.out.println("|   0   |");
                System.out.println("|     0 |");
                break;

            case 4:
                System.out.println("| 0   0 |");
                System.out.println("|       |");
                System.out.println("| 0   0 |");
                break;

            case 5:
                System.out.println("| 0   0 |");
                System.out.println("|   0   |");
                System.out.println("| 0   0 |");
                break;

            case 6:
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                System.out.println("| 0   0 |");
                break;
        }

        System.out.println("+-------+");
    }
}