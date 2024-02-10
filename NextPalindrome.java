import java.util.Scanner;

public class NextPalindrome {
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        return original == reversed;
    }

    public static int nextPalindrome(int num) {
        while (true) {
            num++;
            if (isPalindrome(num)) {
                return num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();

        int nextPal = nextPalindrome(input);
        System.out.println("Next palindrome after " + input + " is: " + nextPal);
    }
}