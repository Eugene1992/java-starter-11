/**
 * Created by Yura on 22.08.2016.
 */
public class HomeWork03 {
    public static void main(String[] args) {
        int sum = 0;

        for (int a = 0; a <= 20; a++) {

            sum = sum + a;
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int a = 0; a <= 20; a++) {
            if (a % 2 == 0) {
                sum1 = sum1 + a;
            }
        }
        System.out.println(sum1);

        int sum2 = 1000;
        for (int a = 0; sum2 <= 9999; a++) {
            System.out.print(sum2 + ", ");
            sum2 = sum2 + 3;
        }
        System.out.println("");
        int sum3 = 1;
        for (int b = 0; sum3 <= 55; b++) {
            System.out.print(sum3 + ", ");
            sum3 = sum3 + 1;
        }

        System.out.println("");
        int sum4 = 90;
        for (int c = 0; sum4 >= 0; c++) {
            System.out.print(sum4 + ", ");
            sum4 = sum4 - 5;
        }
        System.out.println("");
        int sum5 = 2;
        for (int d = 0; d <= 20; d++) {
            System.out.print(sum5 + ", ");
            sum5 = sum5 * 2;
        }
        System.out.println("");

        int n = 20, y = 1, z = 1;
        System.out.print(y + " " + z);
        int sumFib = 2, i = 2;
        while (i < n) {
            sumFib = y + z;
            y = z;
            z = sumFib;
            System.out.print(" " + sumFib);
            i++;
        }
        // самый короткий вариант
        System.out.println("");
        int f = 0;
        for (int m = 1; m < 9999; m = m + f) {
            f += m;
            System.out.print(m + " ");
            System.out.print(f + " ");
        }
    }
}