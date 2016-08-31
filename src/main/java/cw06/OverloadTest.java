package cw06;

/**
 * Created by evgeniy on 29/08/16.
 */
public class OverloadTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append('c').append(true).append("!!");
        System.out.println(stringBuilder);
    }

    static void print(int k) {
        System.out.println(k);
    }

    static void print(double k) {
        System.out.println(k);
        System.out.println(k);
    }

    static void print(int k, long b) {
        System.out.println(k);
        System.out.println(k);
        System.out.println(k);
    }

    static void print(long b, int k) {
        System.out.println(k);
        f();
    }

    static void f(){}


}
