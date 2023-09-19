import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array
        int[] myArray = { 10, 20, 30, 40, 50 };

        // Accessing elements
        System.out.println("Element at index 0: " + myArray[0]);
        System.out.println("Element at index 2: " + myArray[2]);

        // Insertion
        int[] newArray = new int[myArray.length + 1];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        newArray[myArray.length] = 60; // Adds 60 to the end
        myArray = newArray;
        System.out.println("After insertion: " + Arrays.toString(myArray));

        // Deletion
        int indexToRemove = 3;
        int[] updatedArray = new int[myArray.length - 1];
        for (int i = 0, j = 0; i < myArray.length; i++) {
            if (i != indexToRemove) {
                updatedArray[j++] = myArray[i];
            }
        }
        myArray = updatedArray;
        System.out.println("After deletion: " + Arrays.toString(myArray));

        // Updating
        myArray[1] = 25; // Updates element at index 1 (20 -> 25)
        System.out.println("After updating: " + Arrays.toString(myArray));

        // Length
        int arrayLength = myArray.length;
        System.out.println("Array length: " + arrayLength);
    }
}
