//Для введенного целого числа определить является ли это число простым

package homeWorkTest;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int enterNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число");
            String number = scanner.nextLine();
            try {
                enterNumber = Integer.parseInt(number);
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели не число или дробное число. Повторите ввод");
            }
        }
        scanner.close();

        for (int i = 2; i < enterNumber; i++) {
            if (enterNumber % i == 0) {
                System.out.println("Введеное вами число " + enterNumber + " не является простым");
                return;
            }
        }
        if (enterNumber == 1) {
            System.out.println("Введеное вами число " + enterNumber + "  не является простым");
        } else System.out.println("Введеное вами число " + enterNumber + " является простым");

    }
}
