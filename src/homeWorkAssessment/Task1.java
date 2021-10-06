//Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды
//Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды

package homeWorkAssessment;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите количество секунд ");
            String secondIn = scanner.nextLine();
            try {
                number = Integer.parseInt(secondIn);
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели не число или дробное число. Повторите ввод");
            }
        }
        scanner.close();

        int hour = hours(number);

        System.out.println(number);
        System.out.println(hours(number) + " " + declensionHours(hours(number)) +
                           " " + minutes(number) + " " + declensionMinutes(minutes(number)) + " "
                           + second(number) + " " + declensionSecond(second(number)));

        System.out.println(weeks(hour) + " " + declensionWeek(weeks(hour)) + " " + days(hours(number)) + " суток" + " "
                           + hours2(hour) + " " + declensionHours(hours2(hour)) + " "
                           + minutes(number) + " " + declensionMinutes(minutes(number)) + " "
                           + second(number) + " " + declensionSecond(second(number)));

    }

    public static int minutes(int number) {
        return (number - (hours(number)) * 3600) / 60;
    }

    public static int hours(int number) {

        return number / 3600;

    }

    public static int second(int number) {
        return number - (number / 60) * 60;
    }

    public static int weeks(int hour) {
        return hour / 168;
    }

    public static int days(int hour) {
        return (hour - (hour / 168) * 168) / 24;
    }

    public static int hours2(int hour) {
        return hour - (hour / 168 * 168) - (days(hour) * 24) ;
    }

    public static String declensionHours(int count) {
        String one = "час";
        String two = "часа";
        String five = "часов";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }

    public static String declensionMinutes(int count) {
        String one = "минута";
        String two = "минуты";
        String five = "минут";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }

    public static String declensionSecond(int count) {
        String one = "секунда";
        String two = "секунды";
        String five = "секунд";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }

    public static String declensionWeek(int count) {
        String one = "неделя";
        String two = "недели";
        String five = "недель";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }
}
