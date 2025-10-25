import java.util.Scanner;
import java.util.Arrays;

public class Partc {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Read three strings
        System.out.print("Enter three strings: ");
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();

        //Store them in an array
        String[] strings = {str1, str2, str3};

        //Sort the array in alphabetical order
        Arrays.sort(strings);

        //print in order
        for (String word : strings) {
            System.out.println(word);

        }
    }
}
