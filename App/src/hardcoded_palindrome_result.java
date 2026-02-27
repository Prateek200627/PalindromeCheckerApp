import java.util.Scanner;
public class hardcoded_palindrome_result {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Input Text: " +word);
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        boolean isPalindrome;

        if (word.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.println("Is it a palindrome: True");
        } else {
            System.out.println("Is it a palindrome: False");
        }

        scanner.close();
    }
}
