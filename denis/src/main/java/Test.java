/**
 * Created by evgeniy on 22/08/16.
 */
public class Test {
    public static void binar(int a){
        int b;
        String res = "";
        while(a !=0){
            b = a%2;
            res = b + res;
            a = a/2;
        } System.out.print(res);
    }
    public static void main(String [] args) {
        binar(64);
    }
}
