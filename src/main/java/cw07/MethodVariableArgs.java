package cw07;

public class MethodVariableArgs {
    public static void main(String... args) {
        printArray(new int[]{2, 4, 5, 7});
        // printArray(2, 4, 5, 7);
        printArray2(2, 4, 5, 7, 5, 6);
        printArray2(new int[]{2, 4, 5, 7});
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArray2(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] printArray3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

}
