import java.util.Scanner;
public class hardcoded_palindrome_result {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            // Take user input
            System.out.print("Input Text: ");
            String input = scanner.nextLine();

            boolean isPalindrome = true;

            // Loop only till half of the string length
            for (int i = 0; i < input.length() / 2; i++) {

                // Compare characters from both ends
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println("Is it a palindrome? : True");
            } else {
                System.out.println("Is it a palindrome? : False");
            }

            scanner.close();
    }
}
