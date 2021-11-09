package homeWorkAssessment;


public class Pair<T, K> {
    private T objT;
    private K objK;


    public Pair(T objT, K objK) {
        this.objT = objT;
        this.objK = objK;
    }

    public T getObjTFirst() {

        return objT;
    }

    public K getObjKLast() {
        return objK;
    }


    public Pair<T, K> swapObj() {
        return new Pair(objK, objT);

    }

    public Pair<T, K> replaceFirst(Object objU) {
        return new Pair(objU, objK);

    }

    public Pair<T, K> replaceLast(Object objU) {
        return new Pair(objT, objU);

    }

    public void showTypes() {
        System.out.println("Тип T: " + objT.getClass().getName());
        System.out.println("Тип K: " + objK.getClass().getName()+"\n");
    }


    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("wewe", 123213);
        pair1.showTypes();

        System.out.println("Меняем элементы местами");

        Pair pair2 = pair1.swapObj();
        pair2.showTypes();

        System.out.println("Заменяем 1ый элемент на новый");

        Pair pair3 = pair1.replaceFirst(12.21);
        pair3.showTypes();

        System.out.println("Заменяем 2ой элемент на новый");

        Pair pair4 = pair1.replaceLast(12.21f);
        pair4.showTypes();

    }


}
