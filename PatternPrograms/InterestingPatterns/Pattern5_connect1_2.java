package PatternPrograms.InterestingPatterns;

import java.util.Scanner;

public class Pattern5_connect1_2 {
    public static void main(String[] args) {
        int i, j, k, l, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        // Pattern 1
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" " + " ");
            }
            for (l = 3 * 2 - i; l >= 1; l--) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        // Pattern 2
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print(" " + " ");
            }
            for (l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
