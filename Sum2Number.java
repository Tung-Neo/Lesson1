import java.util.Scanner;

public class Sum2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: \n");
        int num1 = sc.nextByte();
        System.out.print("Enter num2: \n");
        int num2 = sc.nextByte();

        int sum = 31 * num1 + 17 * num2;
        System.out.println("Sum = " + sum);
    }
}
