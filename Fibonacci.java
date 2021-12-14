import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int fibo0 = 0, fibo1 = 1, fibo2 = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();

        System.out.print(fibo0 + " " + fibo1);

        sc.close();

        for (int i = 2; i < n; i++) {
            fibo2 = fibo0 + fibo1;
            System.out.print(" " + fibo2);

            fibo0 = fibo1;
            fibo1 = fibo2;

        }

    }

}
