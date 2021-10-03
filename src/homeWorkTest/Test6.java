//Найти максимальный и минимальные элементы массива и вывести их индексы на экран
package homeWorkTest;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {88, 100, 3, 4, 34, 23, 12, 321, 18};
        int maxValue = array[0];
        int minValue = array[0];
        for (int result : array) {
            if (result > maxValue) {
                maxValue = result;
            } else if (result < minValue) {
                minValue = result;
            }
        }
        System.out.println("Максимальное значение " + maxValue);
        System.out.println("Минимальное значение " + minValue);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                System.out.println("Индекс максимального значения " + i);

            } else if (array[i] == minValue) {
                System.out.println("Индекс минимального значения " + i);
            }
        }
    }
}
