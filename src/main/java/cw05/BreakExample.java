package cw05;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 56) {
                System.out.println("End at " + i);
                break;
            }
            System.out.print(i + " ");
        }
    }
}
