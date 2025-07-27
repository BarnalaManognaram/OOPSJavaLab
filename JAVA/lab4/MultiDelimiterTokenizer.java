import java.util.StringTokenizer;
import java.util.Scanner;

public class MultiDelimiterTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with delimiters (comma, semicolon, period, colon):");
        String input = scanner.nextLine();

        // Using , ; . : as delimiters
        StringTokenizer tokenizer = new StringTokenizer(input, ",;.:");

        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim());
        }

        scanner.close();
    }
}
