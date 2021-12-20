package PatternPrograms;

import java.util.Scanner;

public class ReversePyramidStar {
    public static void main(String[] args) {
        int i, j, k, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (k = 1; k < i + n; k++) {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
