public class Example4 {
    public void printArray(int[] arr, int i) {
        if (i >= arr.length)// Termination condition
        {
            return;
        }
        
        printArray(arr, i+1);// Call the function recursively
        System.out.println(arr[i]);// Business logic
    }
}
