import java.util.HashMap;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        HashMap<Character, Integer> vowelsCount = new HashMap<>();
        vowelsCount.put('a', 0);
        vowelsCount.put('e', 0);
        vowelsCount.put('i', 0);
        vowelsCount.put('o', 0);
        vowelsCount.put('u', 0);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowelsCount.containsKey(ch)) {
                vowelsCount.put(ch, vowelsCount.get(ch) + 1);
            }
        }

        System.out.println("Vowel counts:");
        for (char vowel : vowelsCount.keySet()) {
            System.out.println(vowel + ":" + vowelsCount.get(vowel));
        }
    }
}