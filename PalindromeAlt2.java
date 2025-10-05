public class PalindromeAlt2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter line to check: ");
        // Read one line from stdin 
        StringBuilder line = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != -1) {
            if (ch == '\r') {
                continue; // skip carriage return in Windows CRLF
            }
            if (ch == '\n') {
                break; // end of line
            }
            line.append((char) ch);
        }
        String original = line.toString();

        // Build cleaned string with only letters (A-Z, a-z plus locale-specific letters) in lower case
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (Character.isLetter(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\n\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\n\"" + original + "\" is not a palindrome.");
        }
    }

}
