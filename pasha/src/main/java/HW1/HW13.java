package HW1;

import java.util.Scanner;

/**
 * Created by PKo on 28.08.2016.
 */
public class HW13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, x, y;

        System.out.println("Input two numbers to check, which one is closer to 10");

        System.out.print("Input first value: ");
        a = scanner.nextDouble();

        System.out.print("Input second value: ");
        b = scanner.nextDouble();

        x = Math.abs(a - 10);
        y = Math.abs(b - 10);

        if (x < y) {
            System.out.println("Value " + a + " is closer to 10");
        }
        if (x > y) {
            System.out.println("Value " + b + " is closer to 10");
        } else {
            System.out.println("Some equality here");
        }
    }
}

