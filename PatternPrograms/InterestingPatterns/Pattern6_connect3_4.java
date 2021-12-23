package PatternPrograms.InterestingPatterns;

import java.util.Scanner;

public class Pattern6_connect3_4 {
    public static void main(String[] args) {
        int i, j, k, l, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        // Pattern 3
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i = n + 1; i <= n * 2; i++) {
            for (l = i - n; l >= 1; l--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Pattern 4
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print(" " + " ");
            }
            for (j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i = n + 1; i <= n * 2; i++) {
            for (k = n; k >= i - n; k--) {
                System.out.print(" " + " ");
            }
            for (l = i; l >= n + 1; l--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
