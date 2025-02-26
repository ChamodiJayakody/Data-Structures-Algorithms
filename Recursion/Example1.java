public class Example1 {
    public void printName(int n) {
        if (n <= 0) {
            return; //1. Termination
        }
        System.out.println("Hello Students!"); //2. Business logic
        printName(n - 1); //3. Call the function recursively
    }
}