package homeWorkTest.Test10;

import java.util.*;

public class Result {
    enum TypeOperation {
        ADD, REMOVE {
            @Override
            public String getOperation() {
                return " удаление элементов";
            }
        }, CONTAINS {
            @Override
            public String getOperation() {
                return "поиск элемента";
            }
        };
        private String operation;

        public String getOperation() {
            return "добавление элементов";
        }
    }

    protected Collection c;
    protected long elementsCount;
    TypeOperation type;
    protected int time;
    protected int elementRemove;


    public Result(Collection c, long elementsCount, TypeOperation type, int time) {
        this.c = c;
        this.elementsCount = elementsCount;
        this.type = type;
        this.time = time;
    }

    public Result(Collection c, long elementsCount, TypeOperation type, int time, int elementRemove) {
        this.c = c;
        this.elementsCount = elementsCount;
        this.type = type;
        this.time = time;
        this.elementRemove = elementRemove;
    }

    public Result(Collection c, long elementsCount) {
        this.c = c;
        this.elementsCount = elementsCount;
    }

    public Result() {
    }

    @Override
    public String toString() {
        return
                "Тип коллекции:" + c.getClass().getSimpleName() +
                ", тип данных:" + c.stream().findAny().get().getClass().getSimpleName() +
                ", количество элементов " + elementsCount +
                ", операция: " + type.getOperation() +
                ", время выполнения " + time + "ms"
                ;
    }

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList();
        ArrayList<Result> result = new ArrayList();

        Measurement measurement1 = new Measurement(arrayList, 100);
        Measurement measurement2 = new Measurement(arrayList, 10000);
        Measurement measurement3 = new Measurement(arrayList, 1000000);

        result.add(measurement1.measureAdd(arrayList, measurement1.getElementsCount()));
        result.add(measurement2.measureAdd(arrayList, measurement2.getElementsCount()));
        result.add(measurement3.measureAdd(arrayList, measurement3.getElementsCount()));

        result.add(measurement1.measureRemove(arrayList, measurement1.getElementsCount(), 10));
        result.add(measurement2.measureRemove(arrayList, measurement2.getElementsCount(), 100));
        result.add(measurement3.measureRemove(arrayList, measurement3.getElementsCount(), 1000));

        result.add(measurement1.measureContains(arrayList, measurement1.getElementsCount(), 10));
        result.add(measurement2.measureContains(arrayList, measurement2.getElementsCount(), 100));
        result.add(measurement3.measureContains(arrayList, measurement3.getElementsCount(), 1000));


        LinkedList<String> linkedList = new LinkedList<>();

        Measurement measurement4 = new Measurement(linkedList, 100);
        Measurement measurement5 = new Measurement(linkedList, 10000);
        Measurement measurement6 = new Measurement(linkedList, 1000000);

        result.add(measurement4.measureAdd(linkedList, measurement4.getElementsCount()));
        result.add(measurement5.measureAdd(linkedList, measurement5.getElementsCount()));
        result.add(measurement6.measureAdd(linkedList, measurement6.getElementsCount()));

        result.add(measurement4.measureRemove(linkedList, measurement4.getElementsCount(), 10));
        result.add(measurement5.measureRemove(linkedList, measurement5.getElementsCount(), 100));
        result.add(measurement6.measureRemove(linkedList, measurement6.getElementsCount(), 1000));

        result.add(measurement4.measureContains(linkedList, measurement4.getElementsCount(), 10));
        result.add(measurement5.measureContains(linkedList, measurement5.getElementsCount(), 100));
        result.add(measurement6.measureContains(linkedList, measurement6.getElementsCount(), 1000));

        HashSet<String> hashSet = new HashSet<>();

        Measurement measurement7 = new Measurement(hashSet, 100);
        Measurement measurement8 = new Measurement(hashSet, 10000);
        Measurement measurement9 = new Measurement(hashSet, 1000000);

        result.add(measurement7.measureAdd(hashSet, measurement7.getElementsCount()));
        result.add(measurement8.measureAdd(hashSet, measurement8.getElementsCount()));
        result.add(measurement9.measureAdd(hashSet, measurement9.getElementsCount()));


        result.add(measurement7.measureRemove(hashSet, measurement7.getElementsCount(), 10));
        result.add(measurement8.measureRemove(hashSet, measurement8.getElementsCount(), 100));
        result.add(measurement9.measureRemove(hashSet, measurement9.getElementsCount(), 1000));

        result.add(measurement7.measureContains(hashSet, measurement7.getElementsCount(), 10));
        result.add(measurement8.measureContains(hashSet, measurement8.getElementsCount(), 100));
        result.add(measurement9.measureContains(hashSet, measurement9.getElementsCount(), 1000));

        TreeSet<String> treeSet = new TreeSet<>();

        Measurement measurement10 = new Measurement(hashSet, 100);
        Measurement measurement11 = new Measurement(hashSet, 10000);
        Measurement measurement12 = new Measurement(hashSet, 1000000);

        result.add(measurement10.measureAdd(treeSet, measurement10.getElementsCount()));
        result.add(measurement11.measureAdd(treeSet, measurement11.getElementsCount()));
        result.add(measurement12.measureAdd(treeSet, measurement12.getElementsCount()));

        result.add(measurement10.measureRemove(treeSet, measurement10.getElementsCount(), 10));
        result.add(measurement11.measureRemove(treeSet, measurement11.getElementsCount(), 100));
        result.add(measurement12.measureRemove(treeSet, measurement12.getElementsCount(), 1000));

        result.add(measurement10.measureContains(treeSet, measurement10.getElementsCount(), 10));
        result.add(measurement11.measureContains(treeSet, measurement11.getElementsCount(), 100));
        result.add(measurement12.measureContains(treeSet, measurement12.getElementsCount(), 1000));

        result.forEach(System.out::println);

    }


}
