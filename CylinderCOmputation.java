import java.util.Scanner;

public class CylinderCOmputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double SA = 2 * 3.14 * radius * height;
        System.out.print("Enter surfaceArea: " + SA);
        double BA = 2 * 3.14 * radius * (radius + height);
        System.out.print("BaseArea: " + BA);
    }
}
