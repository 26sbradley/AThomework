import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your first name?");
        String name = in.next();

        System.out.println("Hello, " + name + "!");

        System.out.print("How old are you?");
        int age = in.nextInt();

        age++;
        System.out.println("Next year," + name + ", you will be " + age + " years old.");

    }
}

//The variable name input is declared twice making it a complile-time error.
// Java does not allow two variables with the same name in the same method, even if they are different types.
// To fix this, I just needed to use different variable names for the name and the age.
//The corrected code is above. 
