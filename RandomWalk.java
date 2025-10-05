import java.util.Random;
import java.util.Scanner;
import java.awt.Font;



public class RandomWalk {
    
    public static void main(String[] args) {
        Font font = new Font("ROMAN_BASELINE", Font.BOLD, 25);
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int steps = 0;
        int retning;
        System.out.print("Skriv et heltal n: ");
        int n = console.nextInt();
        StdDraw.setXscale(-n, n);
        StdDraw.setYscale(-n, n);
        StdDraw.setPenRadius(2.0 / 400);
        StdDraw.clear(StdDraw.LIGHT_GRAY);

        while ((n >= x && n >= y) && (-n <= x && -n <= y)) {
            retning = rand.nextInt(4);
            steps++;
            if (retning == 0 || retning == 2) {
                x = walk(retning, x);
            } else {
                y = walk(retning, y);
            }
            StdDraw.point(x, y);
            System.out.println("Position: (" + x + ", " + y + ")");
        }
        System.out.println("Antal skridt: " + steps);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(font);
        
        StdDraw.text(0,(double)n-(2*n/10), "Antal skridt: " + steps);

        
    }

    public static int walk(int direction, int xy_in) {
        if (direction == 0 || direction == 1) {
            xy_in++;
        } else {
            xy_in--;
        }

        return xy_in;
    }

}