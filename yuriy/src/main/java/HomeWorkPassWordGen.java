import java.util.Random;

/**
 * Created by Yura on 25.08.2016.
 */
public class HomeWorkPassWordGen {
    public static void main(String[] args) {
        // Генерация случайного пароля заданой длины с помощью строк
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder randString = new StringBuilder();
        int count = 10;
        // int count = (int) (Math.random() * 20); // Случайной длины пароля в диапазоне от 0 до 20
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        System.out.println("PassWord: " + randString);

        // Генерация случайного пароля заданой длины
        String pass = generate(1, 30);
        System.out.println("PassWord : " + pass);
    }
//import java.util.Random;

    public static String generate(int from, int to) {
        String pass = "";
        Random r = new Random();
        int countсhars = from + r.nextInt(to - from + 1);

        for (int i = 0; i < countсhars; ++i) {
            char next = 0;
            int range = 10;

            switch (r.nextInt(3)) {
                case 0: {
                    next = '0';
                    range = 10;
                }
                break;
                case 1: {
                    next = 'a';
                    range = 26;
                }
                break;
                case 2: {
                    next = 'A';
                    range = 26;
                }
                break;
            }

            pass += (char) ((r.nextInt(range)) + next);
        }

        return pass;
    }

}
