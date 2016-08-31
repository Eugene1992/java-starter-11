package cw07;

public class BreakLabel {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4) continue outer;
                System.out.print(j + " ");
            }
            System.out.println("End");
        }
        for (int i = 1; i < 1_000_000; i++) {
            System.out.println();
        }
    }
    /**
     Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик
     у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах
     с номерами 003102 или 567576. С помощью программы, подсчитайте сколько счастливых билетов.
     */
    /* 000001 ... 999999*/
    /* 123321*/
    /* 214421*/
}
