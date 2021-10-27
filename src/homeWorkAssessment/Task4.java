//Создать двумерный квадратный массив размера n.
//        Заполнить его случайными числами таким образом:
//
//        числа по диагонали равны 0;
//        вверху и снизу от пересечения диагоналей находятся только положительные числа;
//        слева и справа от пересечения диагоналей находятся только отрицательные числа;
//
//        Вывести массив ына экран.
//
//        Найти сумму всех элементов
//        Найти среднее арифметическое всех элементов, которые больше суммы всех элементов


package homeWorkAssessment;

public class Task4 {
    public static void main(String[] args) {

        int n = 7;
        int j = 1;
        int b = 0;
        int count2 = 0;
        int sum = 0;
        int sum2 = 0;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {

            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 10 + 1);


                array[i][k] = (int) (Math.random() * 10 + 1);
                array[i][array[i].length - j] = 0;

                if (i == k) {
                    array[i][k] = 0;
                }
            }
            j++;

        }
        for (int i = 1; i < array.length - 1; i++) {
            if (b > (array.length) - i - 1) {
                b--;
            } else {
                b++;
            }
            for (int k = 0; k < b; k++) {

                array[i][k] = (int) ((Math.random() * 10) - 11);

            }

        }

        for (int i = 1, c = array.length - 1; i < array.length - 1; i++) {

            if (c < i) {
                c++;
            } else c--;


            for (int k = array.length - 1; k > c; k--) {

                array[i][k] = (int) ((Math.random() * 10) - 11);

            }

        }


        System.out.println();
        for (int[] ints : array) {

            for (int anInt : ints) {


                System.out.printf("%3s ", anInt);
            }
            System.out.println();
        }

        for (int[] array2 : array) {
            for (int array3 : array2) {

                sum += array3;

            }

        }
        for (int[] array2 : array) {
            for (int array3 : array2) {
                if (array3 > sum) {
                    count2++;
                    sum2 += array3;

                }

            }

        }


        double arithmeticMean = (double) sum2 / count2;
        System.out.println("Сумма всех элементов: " +sum);
        System.out.println("Cреднeе арифметическое всех элементов больше " +sum+": "+arithmeticMean);
    }
}