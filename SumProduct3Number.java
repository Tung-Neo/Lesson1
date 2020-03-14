import java.util.Scanner;

public class SumProduct3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextByte();
        System.out.print("Enter num2: ");
        int num2 =sc.nextByte();
        int num3 = 77;
        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}