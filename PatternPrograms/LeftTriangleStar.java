package PatternPrograms;

import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {

        int i, j, k;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();

        /*-------------First Method-----with using space around star-----
        for (i = 1; i <= rows; i++) {
            for (j = 2 * (rows - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        } */

        // -------------Second Method----without using space around star-----

        for (i = 1; i <= rows; i++) {
            for (k = 1; k <= (rows - i + 1); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
