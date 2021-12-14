import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        int length, width;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        length = sc.nextInt();

        System.out.println("Enter width of Rectangle: ");
        width = sc.nextInt();

        int Perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter of Rectangle is: " + Perimeter);

        sc.close();
    }
}
