import java.util.Scanner;

public class challenge01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Evnter a word or a phrase of your choice: ");
        String input = in.nextLine();

        //This will clean the string, removing all lowercase letters and spaces
        String cleaned = input.replaceAll(" ","").toLowerCase();

        boolean isPalindrome = true;

        //Check if the cleaned string is a palindrome
        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        //Display the results
        if (isPalindrome) {
            System.out.println("Your word or phrase is a palindrome.");
        } else {
            System.out.println("Your word or phrase is not a palindrome.");
        }
    }
    
}
