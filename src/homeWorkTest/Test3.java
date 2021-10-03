//в переменную n должно быть записано случайное (на время тестирования программы) целое число из [0; 28800],
//        далее оно должно выводиться на экран (для Петрова) и в следующей строке (для сотрудниц) должно выводиться фраза
//        из количества полных часов, указся в n секундах.

package homeWorkTest;

public class Test3 {
    public static void main(String[] args) {

        int min = 0;
        int max = 28800;
        int rnd = random(min, max);
        System.out.println(rnd);

        if (rnd < 3600 & rnd != 0) {
            System.out.println("Осталось менее часа");

        } else if (rnd == 0) {
            System.out.println("Рабочий день закончился");

        } else if (hours(rnd) == 1) {
            System.out.println("Остался " + hours(rnd) + " час");
        } else if (hours(rnd) <= 4) {
            System.out.println("Осталось " + hours(rnd) + " часа");
        } else {
            System.out.println("Осталось " + hours(rnd) + " часов");
        }
    }

    public static int random(int min, int max) {
        max = max - min;
        return (int) (Math.random() * (max + 1)) + min;
    }

    public static int hours(int rnd) {
        return rnd / 3600;
    }
}
