import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();

        int x = 0;

        //loop through each character in the phrase
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E') {
                x++; // increment count if character is 'e' or 'E'
            }
        }
        System.out.printf("The letter e appears " +  x  + " times in the phrase.%n", x );
            }
        

    }

