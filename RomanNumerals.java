public class RomanNumerals {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter positive integer to convert: ");
        // Read a line manually
        StringBuilder line = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != -1) {
            if (ch == '\r') continue; // skip CR
            if (ch == '\n') break;    // end line
            line.append((char) ch);
        }
        String input = line.toString().trim();

        if (input.length() == 0) {
            System.out.println("No input provided.");
            return;
        }

        // Validate numeric (only digits)
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("Invalid input: not a positive integer.");
                return;
            }
        }

        // Parse integer manually
        int value = 0;
        for (int i = 0; i < input.length(); i++) {
            value = value * 10 + (input.charAt(i) - '0');
            if (value > 3999) { // early guard
                break;
            }
        }

        if (value < 1 || value > 3999) {
            System.out.println("Number must be in range 1-3999.");
            return;
        }

        String roman = toRoman(value);
        System.out.println(value + " = " + roman);
    }

    private static String toRoman(int num) {
        // Predefined numeral mappings for thousands, hundreds, tens, ones.
        String[] thousands = {"", "M", "MM", "MMM"}; // up to 3000 (3999 max overall)
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int th = num / 1000;
        int h  = (num % 1000) / 100;
        int t  = (num % 100) / 10;
        int o  = num % 10;

        StringBuilder sb = new StringBuilder();
        sb.append(thousands[th]);
        sb.append(hundreds[h]);
        sb.append(tens[t]);
        sb.append(ones[o]);
        return sb.toString();
    }
}