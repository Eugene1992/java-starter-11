package cw08;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello"; // literal
        String s2 = new String("Hello");
        String s3 = "Hello" + " world" + '!';
        String s4 = "Hello" + " world" + (char)getSomeInt();
        String s5 = getSomeString();
        String s6 = new StringTest().toString() + new String().toString();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("\"");
    }

    static int getSomeInt(){
        return 10;
    }

    static String getSomeString(){
        return "Hello world from method!";
    }
}
