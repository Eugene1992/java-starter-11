package HW1;

import java.util.Scanner;
/**
 * Created by PKo on 27.08.2016.
 */
public class HW16 {
    public static void main(String[] args) {

        System.out.println("Input values of the quadratic equation ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double x1;
        double x2;
        double d;

        d = Math.pow(b, 2) - (4 * a * c);

        if(d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Real roots of the equation are:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        else if(d == 0) {
            x1 = x2 = - (b / (2 * a));
            System.out.println("Real roots of the equation are:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        else {
            System.out.println("Equation has no real roots");
        }
    }
}
