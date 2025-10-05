import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter line to check: ");
        if (console.hasNextInt()== true){
            console.close();
            throw new IllegalArgumentException("Må ikke kun skrive tal");
        }
        String texten = console.nextLine();
        boolean isPalindrome = isPalindrome(letters(texten));
        if (isPalindrome == true) {
            System.out.println("\"" + texten + "\" is a palindrome!");
        } else {
            System.out.println("\"" + texten + "\" is not a palindrome!");
        }
        console.close();
    }

    public static boolean isPalindrome(String s) {
        Boolean isPalindrome = false;
        double length = s.length();
        for (int i = 0; i <= length / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static String letters(String s) {
        String renText = "";
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isLetter(s.charAt(i)) == true) {
                renText += s.charAt(i);
            }
        }

        return renText;
    }
}
