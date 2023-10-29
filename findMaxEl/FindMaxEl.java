package findMaxEl;

import java.util.ArrayList;
// Напишите параметризированный метод
// для нахождения максимального элемента в
// диапазоне [begin, end) среди элементов List.
// Какую границу должен иметь параметр такого метода?

public class FindMaxEl<T extends Comparable<T>> {
    public FindMaxEl() {
    }

    public T findMax(int begin, int end, ArrayList<T> list) {
        if (begin >= 0 && end <= list.size() && begin < end) {
            T max = list.get(begin);
            for (int i = begin + 1; i < end; i++) {
                T current = list.get(i);
                if (current.compareTo(max) > 0) {
                    max = list.get(i);
                }
            }
            return max;
        } else throw new IllegalArgumentException("Not correct value");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        FindMaxEl findMaxEl = new FindMaxEl<>();

        list1.add(45);
        list1.add(47);
        list1.add(4);
        list1.add(5);
        list1.add(47);
        list1.add(456);

        list2.add("Tony");
        list2.add("Ann");
        list2.add("Aby");
        list2.add("Sergio");
        list2.add("Yannis");
        list2.add("Daria");

        System.out.println("Max el: " + findMaxEl.findMax(1, 3, list1));
        System.out.println("Max el: " + findMaxEl.findMax(1, 2, list2));
    }
}
