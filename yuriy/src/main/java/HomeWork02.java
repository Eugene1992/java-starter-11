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

        int d1 = 5, d2 = 8, d3 = 10;
        int k, r;
        k = d1 > d2 ? d1 : d2;
        r = k > d3 ? k : d3;
        System.out.println(r + " max");
        int k1, r1;
        k1 = d1 < d2 ? d1 : d2;
        r1 = k1 < d3 ? k1 : d3;
        System.out.println(r1 + " min");

        int q1 = 0, q2 = 1, q3 = 2, q4 = 4;
        int x;
        k = q1 > q2 ? q1 : q2;
        r = k > q3 ? k : q3;
        x = r > q4 ? r : q4;
        System.out.println(x + " max");
        /*if ((q1 != x) && (q1 > (q2 != x)) && (q1 > (q3 != x)) && (q1 > q4)) {
            System.out.println(q1 + " second");
        }
        if ((q2 != x)  && (q2 > q1) && (q2 > q3) && (q2 > q4)) {
            System.out.println(q2 + " second");
        }
        if ((q3 != x)  && (q3 > q2) && (q3 > q1) && (q3 > q4)) {
            System.out.println(q3 + " second");
        }
        if ((q4 != x)  && (q4 > q2) && (q4 > q3) && (q4 > q1)) {
            System.out.println(q4 + " second");
        }*/


        }
    }

