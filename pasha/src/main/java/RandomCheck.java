import java.util.Scanner;

public class RandomCheck {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        int rand = (int) (Math.random() * 5);
        while (true) {
            if (check != rand) {
                System.out.println("Try again");
                rand = (int) (Math.random() * 5);
                check = scanner.nextInt();
            } else {
                System.out.println("You've guessed");
                break;
            }
        }
    }
}