package HW1;

import java.util.Scanner;

/**
 * Created by PKo on 27.08.2016.
 */
public class HW12 {
    public static void main(String[] args) {
        System.out.println("Input number to check if it's even or not");
        System.out.println("Use '0' to exit");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        while (check != 0) {
            if (check % 2 == 0) {
                System.out.println("The number is even");
                check = scanner.nextInt();
            } else {
                System.out.println("The number is uneven");
                check = scanner.nextInt();
            }

        }
    }
}
