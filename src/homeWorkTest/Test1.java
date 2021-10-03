//Имеется прямоугольное отверстие размера a на b.
//Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r

package homeWorkTest;


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double r = 0;

        Scanner scanner = new Scanner(System.in);
        while (a <= 0) {
            System.out.println("Введите размер 'a' прямоугольного отверстия");
            try {
                a = Double.parseDouble(scanner.next());

            } catch (Exception e) {
                System.out.println("Вы ввели не число, повторите ввод размера");
            }
        }

        while (b <= 0) {
            System.out.println("Введите размер 'b' прямоугольного отверстия");
            try {
                b = Double.parseDouble(scanner.next());

            } catch (Exception e) {
                System.out.println("Вы ввели не число, повторите ввод размера");
            }
        }

        while (r <= 0) {
            System.out.println("Введите размер радиуса 'r' круглой картонки");
            try {
                r = Double.parseDouble(scanner.next());

            } catch (Exception e) {
                System.out.println("Вы ввели не число, повторите ввод размера");
            }
        }
        scanner.close();

        if (Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0)) <= 2 * r) {
            System.out.println("Картонка с радиусом " + r + " закрывает полностью отверстие размера " + a + " * " + b);

        } else {
            System.out.println("Картонка с радиусом " + r + " не закрывает полностью отверстие размера " + a + " * " + b);
        }

    }
}