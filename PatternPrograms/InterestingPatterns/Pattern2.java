package PatternPrograms.InterestingPatterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j, k, l, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

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
