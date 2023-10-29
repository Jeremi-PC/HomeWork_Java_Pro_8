package arrChangePos;

import java.util.Arrays;

public class ArrChangePos {
    // Напишите параметризированный метод для обмена позициями
    // двух разных элементов в массиве.
    // Метод принимает параметризированный массив и
    // индексы элементов, которые нужно обменять.
    public static <T> void arrChange(int index1, int index2, T[] array) {
        if (index1 >= 0 && index2 >= 0 && index1 != index2) {
            T temp = array[index2];
            array[index2] = array[index1];
            array[index1] = temp;
        } else throw new IllegalArgumentException("Not correct value of indexes");
    }

    public static void main(String[] args) {

        Integer[] intArr = {15, 12, 13, 54, 5, 8, 9};
        System.out.println(Arrays.toString(intArr));
        String[] strArr = {"Chris", "Bob", "Mary", "Louise", "Katy"};
        System.out.println(Arrays.toString(strArr));
        System.out.println("-----------------------------------");


        arrChange(1,3,intArr);
        arrChange(0,1,strArr);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));

    }
}