//Определить иерархию домашней техники. Включить некоторые в розетку. Посчитать потребляемую мощность.
//Провести сортировку приборов в квартире на основе одного из параметров.
//Найти кухонный прибор в квартире, соответствующий заданный диапазон параметров.



package homeWorkTest.Test9;

public class HomeAppliancesDemo {
    public static void main(String[] args) {
        double appliancesMin = 0.0;
        KitchenAppliances oven = new KitchenAppliances("Oven Samsung", 320.0, 5.0, true, 25.5, 3.2);
        KitchenAppliances breadMaker = new KitchenAppliances("BreadMaker Lg", 190.0, 2.0, true, 5.5, 1.2);
        CleaningAppliances vacuum = new CleaningAppliances("Vacuum Toshiba", 200.0, 3.0, false, 5.3, 0.00, 3);
        CleaningAppliances vacuum2 = new CleaningAppliances("VacuumRobot Toshiba", 120.0, 1.0, true, 1.3, 2.20, 7);
        BeautyCarAppliances fan = new BeautyCarAppliances("Fan LG", 100.0, 5.5, true, 0.8, 1.5, 4);
        BeautyCarAppliances electricShave = new BeautyCarAppliances("ElectricShave Barum", 20.0, 1.5, false, 0.4, 0.7, 1);

        HomeAppliances[] appliances = {electricShave, oven, breadMaker, vacuum, vacuum2, fan};

        oven.plugIn();
        electricShave.plugIn();

        System.out.println("Потребляемая мощность включенных в резетку " + (oven.getPower() + electricShave.getPower()));
        System.out.println("Сортировка приборов по мощности");
        for (int i = 0; i < appliances.length - 1; i++) {
            for (int k = appliances.length - 1; k > i; k--) {

                if (appliances[k - 1].getPower() < appliances[k].getPower()) {
                    HomeAppliances tmp = appliances[k - 1];
                    appliances[k - 1] = appliances[k];
                    appliances[k] = tmp;
                }
            }
        }
        for (HomeAppliances a : appliances) {
            System.out.println(a);
        }
        System.out.println("Прибор соответствующий заданному диапазону параметров.");
        for (HomeAppliances a : appliances) {
            if (a.getPower() < 200 & a.getPower() > 120) {

                System.out.println(a);
            }
        }
    }
}
