//Создать массив заполнить его случайными элементами, распечать, перевернуть, и снова распечатать
//При перевороте элементов не желательно создать еще один массив

package homeWorkTest;

public class Test7 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i =0;i<array.length;i++){
            array[i]=(int)(Math.random()*101);
        }
        for (int result:array) {
            System.out.print(result+" ");

        }
        System.out.println();
        for (int i=0;i< array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for (int result:array) {
            System.out.print(result+" ");

        }
    }
}
