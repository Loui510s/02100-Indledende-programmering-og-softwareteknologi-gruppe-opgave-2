import java.util.Random;
import java.util.Scanner;

public class BuffonsNeedle {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int kast = 0;
        int succes = 0;
        double afstand;
        double vinkel;
        double lower;
        double pi;
        System.out.print("Enter number of iterations ");
        int iterations = console.nextInt();
        // Beregner hvor mange gange programmet skal køre for at den er 1 procent færdig
        double onePercent = (double) iterations / 100;
        int percentComplete = 0;
        while (kast < iterations == true) {
            kast++;
            afstand = rand.nextDouble(2);
            vinkel = rand.nextDouble(180);
            lower = Math.sin(Math.toRadians(vinkel));
            if (lower + afstand >= 2) {
                succes++;
            }
            //Ser om mængden af kast er stor nok til at der skal printes en ny progress.
            if (onePercent * percentComplete < kast) {
                percentComplete++;
                System.out.println((int) ((double) kast * 100 / iterations) + "%");
            }

        }
        pi = (double) kast / succes;
        System.out.println(iterations + " / " + succes + " = " + pi);
        console.close();
    }

}
