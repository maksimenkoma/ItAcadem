//Напишите программу даты следующего дня введя 3 числа - день месяц и год

package homeWorkTest;

import java.time.LocalDate;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int dayNumber;
        int monthNumber;
        int yearNumber;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дату дня месяца");
            String day = scanner.nextLine();
            try {
                dayNumber = Integer.parseInt(day);
                if (1 <= dayNumber & dayNumber <= 31) {
                    break;

                } else {
                    System.out.println("В месяце от 1 до 31 дней))");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели не число или дробное число. Повторите ввод");
            }
        }

        while (true) {
            System.out.println("Введите номер месяца");
            String month = scanner.nextLine();
            try {
                monthNumber = Integer.parseInt(month);
                if (1 <= monthNumber & monthNumber <= 12) {
                    break;

                } else {
                    System.out.println("В году от 1 до 12 месяцев))");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели не число или дробное число. Повторите ввод");
            }
        }

        while (true) {
            System.out.println("Введите год");
            String year = scanner.nextLine();
            try {
                yearNumber = Integer.parseInt(year);
                if (0 <= yearNumber) {
                    break;

                } else {
                    System.out.println("Год не может быть отрицательным");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели не число или дробное число. Повторите ввод");
            }
        }
        LocalDate date = LocalDate.of(yearNumber, monthNumber, dayNumber);
        LocalDate nextDay = date.plusDays(1);
        System.out.println("Вы ввели дату " + date + "\n" + "Следующий день " + nextDay);

    }

}
