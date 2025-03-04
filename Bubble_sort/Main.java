package Bubble_sort;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        int[] data = { 6, 5, 8, 1, 2 };

        BubbleSort.bubbleSortAlgorithm(data);

        System.out.println("The array performing the Bubble Sort Algorithm is:");
        System.out.println(Arrays.toString(data));
    }
}