package Quick_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = { 6, 5, 7, 3, 24, 8, 1, 2 };

        QuickSort sorter = new QuickSort();
        sorter.quickSort(data, 0, data.length - 1);

        System.out.println("The array after performing Quick Sort:");
        System.out.println(Arrays.toString(data));
    }
}
