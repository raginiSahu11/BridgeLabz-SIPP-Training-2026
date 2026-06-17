public class MultipleCatchDemo {

    static void printValue(int[] arr, int index) {

        try {
            System.out.println(
                    "Value at index " + index +
                            ": " + arr[index]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch(NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        printValue(arr,1);
        printValue(arr,5);

        arr = null;

        printValue(arr,0);
    }
}