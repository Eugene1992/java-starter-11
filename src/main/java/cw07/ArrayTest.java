package cw07;

public class ArrayTest {
    public static void main(String[] args) {
        byte[] array = {10, 20, 30, 40, 50};

        for (int i = 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            byte b = array[i];
            System.out.print(b + " ");
        }

        for (byte b : array) {
            System.out.print(b + " ");
        }

        System.out.println();






        int[][] arr = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        String[][] strings = new String[][]{
                {"1", "1", "1"},
                {"1", "0", "1"},
                {"1", "1", "1"}
        };

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
