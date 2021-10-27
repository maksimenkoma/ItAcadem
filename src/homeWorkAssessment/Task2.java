//В американской армии считается несчастливым число 13, а в японской — 4.
//Перед международными учениями штаб российской армии решил исключить номера боевой техники, содержащие числа 4 или 13
//(например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег.
//Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999,
//то сколько всего номеров придётся исключить?


package homeWorkAssessment;

public class Task2 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 100000; i++) {

            if (i - (i / 10 * 10) == 4) {
                ++count;
                System.out.println(i);
                continue;
            }

            if ((i - (i / 100 * 100)) / 10 == 4) {
                ++count;
                System.out.println(i);
                continue;
            }
            if (((i - (i / 1000 * 1000)) / 100) == 4) {
                ++count;
                System.out.println(i);
                continue;
            }
            if (((i - (i / 10000 * 10000)) / 1000) == 4) {
                ++count;
                System.out.println(i);
                continue;
            }

            if (i / 10000 == 4) {
                ++count;
                System.out.println(i);
                continue;
            }

            if (i - (i / 10 * 10) == 3) {
                if ((i - (i / 100 * 100)) / 10 == 1) {
                    ++count;
                    System.out.println(i);
                    continue;
                }
            }
            if ((i - (i / 100 * 100)) / 10 == 3) {
                if ((i - (i / 1000 * 1000)) / 100 == 1) {
                    ++count;
                    System.out.println(i);
                    continue;
                }
            }
            if ((i - (i / 1000 * 1000)) / 100 == 3) {
                if (((i - (i / 10000 * 10000)) / 1000) == 1) {
                    ++count;
                    System.out.println(i);
                    continue;
                }
            }

            if ((i - (i / 10000 * 10000)) / 1000 == 3) {
                if ((i / 10000) == 1) {
                    ++count;
                    System.out.println(i);
                }

            }
        }
        System.out.println("Суммарное число комбинаций " + count);
    }
}
