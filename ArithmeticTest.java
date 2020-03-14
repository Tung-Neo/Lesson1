public class ArithmeticTest {
    public static void main(String[] args) {
        int num1 = 98;
        int num2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.print("The sum, difference, product, quotient and remainder of " + num1 + " and " + num2 + " are " + sum + ", " + difference + ", " + product + ", " + quotient + ", and" + remainder);

        ++num1;
        --num2;
        System.out.println("\nnum1 after increment is " + num1);
        System.out.println("num2 after decrement is " + num2);
        quotient = num1/num2;
        System.out.println("The new quotient of " + num1 + " and " + num2 + " is " + quotient);
    }
}
