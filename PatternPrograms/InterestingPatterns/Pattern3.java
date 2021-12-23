package PatternPrograms.InterestingPatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int i, j, k, l, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

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
        sc.close();
    }
}
