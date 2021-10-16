//Имеется строка с текстом.
//Подсчитайте уникальное количество слов в тексте.
//Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
//Пробелы могут присутствовать в начале и конце текста.

package homeWorkAssessment;

public class Task5 {
    public static void main(String[] args) {


        String str = "Пробелы могут присутствовать в начале и конце текста. " +
                     "Пробелы могут присутствовать в количество слов в тексте текста в";

        String str2 = str.toLowerCase();
        str2 = str.replaceAll("[,./';:!?-]", " ");
        String[] array = str2.split("\\s+");
        String[] array2 = new String[array.length];
        int count1 = 0;
        int count2 = 0;
        for (String b: array){
            count1++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if ((array[i].equals(array[j]))) {
                    array2[i] = array[i];
                    count2++;
                    break;
                }
            }
        }
        System.out.println(str);
        System.out.println(count1-count2);

    }
}
