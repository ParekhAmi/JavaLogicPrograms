package PatternPrograms.NumbersPattern;

import java.util.Scanner;

public class ReversePyramidNumbers {
    public static void main(String[] args) {
        int i,j,k,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();

        for(i=1;i<=n;i++){
            for(k=1;k<=n+i;k++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        sc.close();

    }
}
