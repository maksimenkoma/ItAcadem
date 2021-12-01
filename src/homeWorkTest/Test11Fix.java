package homeWorkTest;

import java.util.*;

public class Test11Fix {

    private ArrayList list;

    public Test11Fix(ArrayList list) {
        this.list = list;
    }

    public void push(Integer i) {

        list.add(i);

    }

    public Integer pop() {

        Integer a = (Integer) list.remove((list.size() - 1));

        System.out.println("Удаляем вершину стека " + a);

        return a;
    }

    public Integer max() {
        System.out.println("Максимальный элемент");
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::intValue));
        if (max.isPresent()) {
            System.out.println(max.get());
            return max.get();

        } else return null;

    }

    public void print() {

        list.forEach(System.out::println);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Test11Fix test11Fix = new Test11Fix(list);
        test11Fix.push(12);
        test11Fix.push(33);
        test11Fix.push(11);
        test11Fix.push(22);
        test11Fix.push(1);

        test11Fix.print();
        test11Fix.pop();
        System.out.println("Стэк после удаления вершины");
        test11Fix.print();
        test11Fix.max();


    }


}


