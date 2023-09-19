# Arrays in Programming

## What is an Array?

- An array is a data structure that stores a collection of elements of the same data type.
- Elements in an array are accessed using their index, which starts from 0 for the first element.
- Arrays are useful for storing and manipulating lists of data efficiently.

## Array Initialization

- Arrays can be initialized with a fixed size (static) or a dynamic size (dynamic array or list).
- In Java, you need to specify the size of a static array when declaring it.

## Basic Array Operations

1. **Accessing Elements**: You can access elements by their index.

2. **Insertion**: Adding elements to an array.
   - For a static array, this may require shifting elements to make space.
   - For dynamic arrays/lists, you can often append elements without shifting.

3. **Deletion**: Removing elements from an array.
   - For a static array, this may require shifting elements to close the gap.
   - For dynamic arrays/lists, you can often remove elements without shifting.

4. **Updating**: Modifying the value of an element at a specific index.

5. **Length**: Finding the number of elements in an array.

---

## Sample Array Program in Java

```java
public class ArrayExample {
    import java.util.Arrays;
    public static void main(String[] args) {
        // Creating an array
        int[] myArray = {10, 20, 30, 40, 50};

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
```
