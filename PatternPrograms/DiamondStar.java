package PatternPrograms;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        int i, j, k, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        //First Part
        for (i = 1; i <= n; i++) {
            for (k = n - i; k >= 1; k--) {
                System.out.print(" ");

            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

        //Second Part
        for (i = n - 1; i >= 1; i--) {
            for (k = n - 1 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
