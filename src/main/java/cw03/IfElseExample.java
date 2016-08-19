package cw03;

public class IfElseExample {
    public static void main(String[] args) {
        int a = 19;
        System.out.println("Start");
        if (a > 20) {
            System.out.println("a > 20");
        } else if (a == 20){
            System.out.println("a == 20");
        } else {
            System.out.println("a < 20");
        }
        System.out.println("End");
    }
}
