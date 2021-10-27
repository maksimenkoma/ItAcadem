//Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
//
//        Создать несколько объектов-цветов.
//        Собрать букет и определить его стоимость.
//        Определить все цвета, используемые в букете.
//        Определить когда весь букет завянет.
//
//        В букет может входить несколько цветов одного типа.

package homeWorkAssessment.Task6;

public class FlowerDemo {

    public static void main(String[] args) {

        double sumPrice = 0;

        Rose rose1 = new Rose("Turkish", 23, 1.2, "red", 55.5);
        Rose rose2 = new Rose("Turkish", 30, 2.2, "blue", 55.5);
        Tulips tulips1 = new Tulips("Russia", 10, 0.8, "blue", "5");
        Tulips tulips2 = new Tulips("Russia", 12, 0.3, "yellow", "2");
        Orchid orchid1 = new Orchid("Mexico", 4, 2.5, "white", 30);
        Orchid orchid2 = new Orchid("Mexico", 5, 3.5, "pink", 30);

        Flower[] bouquet1 = {rose1, tulips1, tulips2, orchid1, rose2, rose1, tulips1, orchid2};

        for (Flower bouquet : bouquet1) {
            double a = bouquet.getPrice();
            sumPrice += a;
        }
        System.out.println("Общая сумма букета bouque1  " + sumPrice);
        System.out.print("Цвета, используемые в букете: ");
        for (Flower bouquet : bouquet1) {
            String b = bouquet.getColor();
            System.out.print(b + " ");

        }
        int maxShelfLife = bouquet1[0].getShelfLife();
        for (Flower c : bouquet1) {
            if (c.getShelfLife() > maxShelfLife) {
                maxShelfLife = c.getShelfLife();
            }
        }
        System.out.println();
        System.out.println("Срок годности букета " + maxShelfLife + " дней");
    }
}

