package PatternPrograms.NumbersPattern;

import java.util.Scanner;

public class NumbersWithoutReassigning {
    public static void main(String[] args) {
        int i, j, n;
        int num = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println("");
        }
        sc.close();
    }
}
