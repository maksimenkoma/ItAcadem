//Найти в строке все знаки препинания.
//Подсчитать общее количество их.


package homeWorkTest;

public class Test8 {
    public static void main(String[] args) {
        int count=0;
        String str = "! Лето красное ? пропела;\n" +
                     "Оглянуться не успела,\n" +
                     "Как зима катит в глаза.\n" +
                     "Помертвело чисто поле;\n" +
                     "Нет уж дней тех светлых боле,\n" +
                     "Как под каждым ей листком\n" +
                     "Был готов и стол и дом.";
        str = str.replaceAll("[a-zA-Z0-9А-Яа-я]", " ");
        String[] result = str.split("\\s+");
        for (String results:result) {
            count++;
            System.out.print(results);

        }
        System.out.println();
        System.out.println("Общее количество всех знаков препинания " +count);
    }
}
