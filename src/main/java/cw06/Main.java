package cw06;

/**
 * Created by evgeniy on 29/08/16.
 */
public class Main {
    public static void main(String[] args) {
        int rand;
        String pass = "";
        for (int i = 0; i < 10;) {
            rand = (int)(Math.random() * 84 + 48);
            if (rand >= 48 && rand <= 57 || rand >= 65 && rand <= 90 || rand >= 97 && rand <= 122) {
                pass += (char)rand;
                i++;
            }
        }
        System.out.println(pass);
    }
}
