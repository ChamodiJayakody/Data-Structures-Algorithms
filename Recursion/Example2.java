public class Example2 {
    public void printArray(int[] arr, int i) {
        if (i >= arr.length)// Termination condition
        {
            return;
        }
        System.out.println(arr[i]);// Business logic
        printArray(arr, i+1);// Call the function recursively
    }
}