import java.util.Scanner;

public class RomanNumeralsAlt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter positive integer to convert: ");
        int tal = console.nextInt();
        if (tal < 0) {
            console.close();
            throw new IllegalArgumentException("Skriv et positivt tal");
        }
        String romer_Tal = toRoman(tal);
        System.out.println(tal + " = " + romer_Tal);
        console.close();
    }

    public static String toRoman(int tal) {
        String romer_tal = "";
        int antal;
        if (tal >= 1000) {
            antal = tal / 1000;
            for (int i = 0; i < antal; i++) {
                romer_tal += "M";
                tal -= 1000;
            }
        }
        if (tal >= 900) {
            romer_tal += "CM";
            tal -= 900;
        }
        if (tal >= 500) {
            romer_tal += "D";
            tal -= 500;
        }
        if (tal >= 400) {
            romer_tal += "CD";
            tal -= 400;
        }
        if (tal >= 100) {
            antal = tal / 100;
            for (int i = 0; i < antal; i++) {
                romer_tal += "C";
                tal -= 100;
            }
        }
        if (tal >= 90) {
            romer_tal += "XC";
            tal -= 90;
        }
        if (tal >= 50) {
            romer_tal += "L";
            tal -= 50;
        }
        if (tal >= 40) {
            romer_tal += "XL";
            tal -= 40;
        }
        if (tal >= 10) {
            antal = tal / 10;
            for (int i = 0; i < antal; i++) {
                romer_tal += "X";
                tal -= 10;
            }
        }
        if (tal >= 9) {
            romer_tal += "IX";
            tal -= 9;
        }
        if (tal >= 5) {
            romer_tal += "V";
            tal -= 5;
        }
        if (tal >= 4) {
            romer_tal += "IV";
            tal -= 4;
        }
        if (tal >= 1) {
            antal = tal / 1;
            for (int i = 0; i < antal; i++) {
                romer_tal += "I";
                tal -= 1;
            }
        }
        return romer_tal;
    }
}
