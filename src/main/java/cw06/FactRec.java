package cw06;

public class FactRec {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int getFactorialByLoops(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }

    static int fact(int num) {
        return num == 1 ? 1 : num * fact(num - 1);
    }

        static int fib(int num) {
            if (num < 2) return num;
                return fib(num - 2) + fib(num - 1);
        }
}
