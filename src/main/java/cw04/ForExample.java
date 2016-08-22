package cw04;

public class ForExample {
    public static void main(String[] args) {
        /*
        * for (init; condition; counter) {
        * }
        */
        boolean b = 10 > 2;

        for (int counter = 0, j = 10; b; counter++, j--) {
            System.out.print(j + " ");
        }

        int i = 12;

        if (i / 2 == 10 & i < 15 && i > 20 / 2) { // (true && true && false)
            System.out.println("True");
        }


    }
}
