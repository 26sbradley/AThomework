import java.util.Scanner;

public class RegisterDemo {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       CashRegister cr = new CashRegister();

       System.out.println("Enter item price, 't' for total, 'd' delete last, 'c' clear, 'q' quit");

       while (true) {
           System.out.print("> ");

           if (in.hasNextDouble()) {
               double price = in.nextDouble();
               cr.addItem(price);
           }
           else {
               String input = in.next();

               if (input.equalsIgnoreCase("t")) {
                   System.out.println("Items: " + cr.getCount());
                   System.out.printf("Total: $%.2f%n", cr.getTotal());
               }
               else if (input.equalsIgnoreCase("d")) {
                   cr.removeItem();
               }
               else if (input.equalsIgnoreCase("c")) {
                   cr.clear();
               }
               else if (input.equalsIgnoreCase("q")) {
                   break;
               }
           }
       }

       in.close();
   }
}