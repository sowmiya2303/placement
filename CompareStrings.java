import java.util.Scanner;

public class CompareStrings {
    public static void compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Strings must be of equal length");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("Mismatched pair: " + str1.charAt(i) + ", " + str2.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        compare(str1, str2);
    }
}