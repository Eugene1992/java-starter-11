package cw05;

public class MethodsExample {
    public static void main(String[] args) {
        printNumberInterval(5, 10, 1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printNumberInterval(10, 20, 1);
        System.out.println();
        printNumberInterval(0, 100, 10);
        System.out.println();


        int a = getSum(10, 100);
        int b = getSum(2, 80);
        int c = getSum(a, b);
        System.out.println(getSum(getSum(10, 2), getSum(getSum(19, 2), getSum(10, 2))));
    }

    static void printNumberInterval(int min, int max, int step) {
        for (int i = min; i < max; i += step) {
            System.out.print(i + " ");
        }
    }

    static int getSomeNumber() {
        return 10;
    }

    static int getSum(int a, int b) {
        return getSomeNumber() + 10;
    }
}
