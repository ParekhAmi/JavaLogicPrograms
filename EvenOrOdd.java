import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        }
        sc.close();

    }
}
