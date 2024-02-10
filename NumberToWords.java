import java.util.Scanner;

public class NumberToWords {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        if (num < 0 || num > 99999) {
            return "Out of Range";
        }

        String words = "";

        if (num / 1000 > 0) {
            words += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if (num / 100 > 0) {
            words += convertToWords(num / 100) + " Hundred ";
            num %= 100;
        }

        if (num >= 20) {
            words += tens[num / 10] + " ";
            num %= 10;
        }

        if (num > 0) {
            words += units[num];
        }

        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0-99999): ");
        int input = scanner.nextInt();
        scanner.close();

        System.out.println(convertToWords(input));
    }
}