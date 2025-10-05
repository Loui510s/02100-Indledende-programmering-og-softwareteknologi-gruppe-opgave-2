import java.util.Scanner;

public class PalindromeAlt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter line to check: ");
        String original = scanner.nextLine();
        String tekstUdenMellemrum = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(tekstUdenMellemrum).reverse().toString();
        
        if (tekstUdenMellemrum.equals(reversed)) {
            System.out.println("'" + original + "' is a palindrome!");
        } else {
            System.out.println("'" + original + "' is not a palindrome.");
        }
        
        scanner.close();
    }
}

