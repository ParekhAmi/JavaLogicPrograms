import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter second number: ");
        b = sc.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;
        sc.close();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
