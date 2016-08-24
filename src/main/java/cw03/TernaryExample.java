package cw03;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 7;
        int b;

        if (a > 5) {
            if (a == 9) {
                b = 0;
            } else {
                b = 7;
            }
        } else {
            b = 0;
        }

        b = a > 5 ?  2 : 7;
        // b =  condition  ? true : false;

        System.out.println(b);
    }
}
