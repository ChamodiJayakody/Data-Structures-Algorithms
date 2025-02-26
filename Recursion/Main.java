public class Main {

    public static int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String[] args) {

        Example1 example = new Example1();
        example.printName(5);

        Example2 array = new Example2();
        array.printArray(array1, 0);

        Example3 reverseArray1 = new Example3();
        reverseArray1.printArray(array1, 10);

        Example3 reverseArray2 = new Example3();
        reverseArray2.printArray(array1, 10);
    }
}