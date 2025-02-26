public class Example3 {
    public void printArray(int[] arr, int i) {
        if (i <=0)// Termination condition
        {
            return;
        }

        System.out.println(arr[i-1]);// Business logic
        printArray(arr, i-1);// Call the function recursively
    }
}
