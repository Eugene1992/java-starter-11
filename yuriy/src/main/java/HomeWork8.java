/**
 * Created by Yura on 31.08.2016.
 */
public class HomeWork8 {
    public static void main(String[] args) {
        // «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
        int b = 0;
        for (int i = 1001; i < 1000000; i++) {
            int i1 = i / 100000 % 10,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                b++;
                //System.out.println(i1+i2+i3 + " сумма равна" + i4+i5+i6);
            }
        }
        System.out.println("Количество счастливых билетиков: " + b);

        // Не счастливый билетик
        int num = 999999;
        int count = 0;
        System.out.println("Не счастливые номера:");
        for (int i = 1; i < num; i++) {
            if (i % 100 == 13 || i % 1000 == 130 || i % 10000 == 1300 || i % 100000 == 13000 || i % 1000000 == 130000) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Всего несчастливых чисел 13 из 999999 = " + count);

        int[] array = {10, 20, 30, 40, 50};
        System.out.println("сумма всех чисел масива " + printArray(array));
    }

    static int printArray(int... array) {
        // сумма всех чисел масива
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum = array[j] + sum;
        }
        return sum;
    }

}