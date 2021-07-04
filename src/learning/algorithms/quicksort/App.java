package learning.algorithms.quicksort;

import java.util.Arrays;


public class App {
    public static void main(String[] args){

        int[] inputArray = {12, 81, 74, 123, 4, 99, 180, 0, 99, 67, 11, 101, 19, 5, 88};
        QuickSort Qs = new QuickSort();
        Qs.quickSort(inputArray);

        System.out.println(Arrays.toString(inputArray));

    }
}
