import java.util.Scanner;

public class PartD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PartC die = new PartC();

        String command;

        while(true) {

            System.out.print("Enter 'r' to roll, 'd' to display,or 'q' to quit: ");
            command = input.nextLine();

            if(command.equals("r")) {
                die.roll();
                System.out.println("die was rolled. value = " + die.getValue());
            }
            else if(command.equals("d")) {
                die.display();
            }
            else if(command.equals("q")) {
                System.out.println("Bye!");
                break;
            }
        }

        input.close();
    }
}