public class HW35 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int sum;
        for(int i = 1; i <= 20; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
