package homeWorkTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test11 {

    private Integer arr[];
    private int top;
    private int capacity;
    private Integer returnPop;
    private Integer max=0;



    public Test11(int size) {
        capacity = size;
        arr = new Integer[capacity];
        top = -1;

    }

    public Integer getMax() {
        return max;
    }

    public int getCapacity() {
        return capacity;
    }

    public Test11(Integer[] arr, Integer returnPop) {
        this.arr = arr;
        this.returnPop = returnPop;
    }


    public Integer push(Integer x) {
        if (isFull()) {
            System.out.println("Переполнен");
        }
        System.out.println("Добавляем " + x);

        arr[--capacity] = x;
        if (max < x) {
            max = x;
        }
        return max;
    }

    public Test11 pop(Integer arr[]) {
        System.out.println("Удаляем вершину стека ");
        if (isEmpty()) {
            System.out.println("Пуст");
        }
        returnPop = arr[0];
        Integer[] arrayResult = new Integer[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            arrayResult[i] = arr[i + 1];
        }
        System.out.println(returnPop);
        for (Integer a : arrayResult) {
            System.out.print(a + " ");

        }
        System.out.println();
        return new Test11(arrayResult, returnPop);

    }

    public void max() {

        System.out.println("Максимальное значение " + getMax());

    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {

        return capacity == 10;
    }


    public void printSack() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Test11 stack = new Test11(5);
        stack.push(1);
        stack.push(33);
        stack.push(12);
        stack.push(4);
        stack.push(14);

        System.out.println();

        Test11 stack2 = new Test11(5);
        stack2.push(116);
        stack2.push(72);
        stack2.push(8);
        stack2.push(2);
        stack2.push(10);

        stack.printSack();
        stack2.printSack();

        stack.pop(stack.arr);
        stack.pop(stack2.arr);

        stack.max();
        stack2.max();

    }
}
