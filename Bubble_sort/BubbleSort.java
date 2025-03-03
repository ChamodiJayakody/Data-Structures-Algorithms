package Bubble_sort;

public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return; //1. Termination
        }
        for (int i = n-1; i > 0 - 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) { //2. Comparison
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        bubbleSort(arr, n - 1); //3. Call the function recursively
    }
}
