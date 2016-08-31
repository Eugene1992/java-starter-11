

public class MethodHomeWork {

    public static String surplus(int[] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        ;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Sum of variables of the massive with a length of" + " " + arr.length + " " + "is" + " " + surplus(arr));

    }

}
