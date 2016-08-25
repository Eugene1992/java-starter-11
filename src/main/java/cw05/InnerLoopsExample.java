package cw05;

public class InnerLoopsExample {
    public static void main(String[] args) throws InterruptedException {
        /*for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                Thread.sleep(1000);
                System.out.print(" j = " + j);
            }
            System.out.println();
        }*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }

}
