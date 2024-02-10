import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MismatchedSubstrings {
    public static List<String> mismatchedSubstrings(String str1, String str2) {
        List<String> result = new ArrayList<>();
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                int j = i;
                while (j < minLength && str1.charAt(j) != str2.charAt(j)) {
                    j++;
                }
                result.add(str1.substring(i, j));
                i = j - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        
        List<String> mismatches = mismatchedSubstrings(str1, str2);
        System.out.println("Mismatched Substrings:");
        for (String mismatch : mismatches) {
            System.out.println(mismatch);
        }
    }
}