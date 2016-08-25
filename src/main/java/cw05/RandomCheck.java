package cw05;

import java.util.Scanner;

public class RandomCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = (int)(Math.random() * 5);
        System.out.println("Enter a number, please: ");
        while (true) {
            int num = scanner.nextInt();
            if (check == num) {
                System.out.println("Congratulations! You guessed it!");
                break;
            }
            System.out.println("You are not right, try again!");
        }
    }
}
