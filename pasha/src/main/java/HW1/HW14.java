package HW1;

import java.util.Scanner;
/**
 * Created by PKo on 27.08.2016.
 */
public class HW14 {
    public static void main(String[] args)
    throws java.io.IOException {
        System.out.println("Input numbers to check, which one is the highest");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a: ");
        int a = scanner.nextInt();
        System.out.print("input b: ");
        int b = scanner.nextInt();
        System.out.print("input c: ");
        int c = scanner.nextInt();
        char d;
        while(true) {
            if (a > b && a > c) {
                System.out.println("The highest number is " + a);
            } else if (b > a && b > c) {
                System.out.println("The highest number is " + b);
            } else if (c > a && c > b) {
                System.out.println("The highest number is " + c);
            } else if (a == b || b == c || c == a) {
                System.out.println("You've got some equal numbers");
            } else {
                System.out.println("Something went wrong");
            }
            System.out.println("Do you wish to continue? (y/n)");
            d = (char) System.in.read();
            if (d == 'y') {
                System.out.print("input a: ");
                a = scanner.nextInt();
                System.out.print("input b: ");
                b = scanner.nextInt();
                System.out.print("input c: ");
                c = scanner.nextInt();
            }
            else if (d == 'n'){
                break;
            }
        }

    }
}
