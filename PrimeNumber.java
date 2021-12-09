import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number, flg;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        System.out.println("Prime numbers from 1 antod " + number);

        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            flg = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
