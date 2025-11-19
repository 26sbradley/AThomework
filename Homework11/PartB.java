import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int cookies = in.nextInt();
        double discount;

        if (num > 12) {
            discount = 0.10;
        } else if (num > 6) {
            discount = 0.05;
        } else {
            discount = 0.0;
    }

    System.out.println("Discount = " + discount);
}
}

//This was a logic error because the second condition, num > 12, 
// will never run due to it being inside the else if, after num > 6
// So, because of this, discount is never initialized if num =< 6