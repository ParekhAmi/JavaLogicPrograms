package PatternPrograms;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        int i, j, k, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for(k=1;k<=n*2-(i+1);k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
