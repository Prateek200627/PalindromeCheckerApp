import java.util.Scanner;
public class hardcoded_palindrome_result {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input Text: ");
            String input = scanner.nextLine();

            boolean isPalindrome = true;

            for (int i = 0; i < input.length() / 2; i++) {

                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Is it a palindrome? : True");
            } else {
                System.out.println("Is it a palindrome? : False");
            }

            scanner.close();
    }
}
