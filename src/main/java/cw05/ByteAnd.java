package cw05;

/**
 * Created by evgeniy on 24/08/16.
 */
public class ByteAnd {
    public static void main(String[] args) {
        System.out.println(10 & 3);

        /*
            0000 1010
           &
            0000 0011
            ---------
            0000 0010
        */

        System.out.println(10 | 3);

        /*
            0000 1010
           |
            0000 0011
            ---------
            0000 1011
        */

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println(10 ^ 3);

        /*
            0000 1010
           ^
            0000 0011
            ---------
            0000 1001
        */

        System.out.println(16 << 4);

        // 0001 0000
        // 0100 0000

        System.out.println(16 >> 2);

        // 0001 0000
        // 0000 0100


    }
}
