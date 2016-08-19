package cw03;

/**
 * Created by evgeniy on 19/08/16.
 */
public class SwitchExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        /*if (a == 10) {
            System.out.println("A");
        }

        if (a == 11) {
            System.out.println("B");
        }

        if (a == 12) {
            System.out.println("C");
        }*/

        switch (a) {
            case 10:
                switch (b) {
                    case 10:
                        System.out.println("B");
                }
                System.out.println("A");
                break;

            case 11:
                System.out.println("B");
                break;

            case 12:
                System.out.println("C");
                break;

            default:
                System.out.println("a undefined");
        }

        String s = "Hello";

        if (s.equals("Hello")) {

        }

        switch (s) {
            case "Hello":

        }
    }
}
