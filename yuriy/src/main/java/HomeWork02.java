/**
 * Created by Yura on 19.08.2016.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int a1;
        a1 = 12;
        if (a1 % 2 == 0) {
            System.out.println("a1 четное");
        } else {
            System.out.println("a1 не четное");
        }

        double b1 = 8.5;
        double b2 = 11.45;
        double c1 = 10 - b1;
        double c2 = b2 - 10;
        if (c1 < c2) {
            System.out.println("b1 ближайшее к 10");
        } else {
            System.out.println("b2 ближайшее к 10");
        }
        double d1 = 8.5;
        double d2 = 10.5;
        double d3 = 1.5;
        double k;
        k = d1 > d2 ? d1 : d2;
        {
            System.out.println("k maximum");
        }
    }
}
