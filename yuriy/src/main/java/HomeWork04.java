import java.util.Scanner;

/**
 * Created by Yura on 24.08.2016.
 */
public class HomeWork04 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        int rand = (int) (Math.random() * 10);
        while (true) {
            if (check == rand) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Try again:");
                check = scanner.nextInt();
            }
        }
        System.out.println(getUplikationNumber(2, 0));
    }

    static int getUplikationNumber(int x, int y) {
        int sum = 1;
        for (int k = 1; k <= y; k++) {
            sum = sum * x;
        }
        return sum;
    }
}


