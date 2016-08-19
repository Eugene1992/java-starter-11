package cw03;

public class IfExample {
    public static void main(String[] args) {
        int a = 2;
        boolean b = true;

        if (b) {
            System.out.println("True");
        }

        if (a > 0) { // > < >= <= == !=
            System.out.println("True");
        }

        if (a == 10) {
            System.out.println("True");
        }

        if (a != 7) {
            System.out.println("True");
        }

        if (a >= 10) {
            System.out.println("True");
        }

        if (a <= 10) {
            System.out.println("True");
        }

        if (a < 20) {
            if (a > 5) {
                System.out.println("True!");
            }
            System.out.println("!!!");
        }
    }
}
