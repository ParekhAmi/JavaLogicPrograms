import java.util.Scanner;

public class LargestNumber {

    public static void largestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest number");
        } else {
            System.out.println(c + " is largest number");
        }
    }

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();

        System.out.println("Enter 3rd number: ");
        c = sc.nextInt();

        largestNumber(a, b, c);
        sc.close();
    }
}
