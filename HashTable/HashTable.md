# Hash Tables in Programming

## What is a Hash Table?

- A hash table is a data structure that stores key-value pairs.
- It uses a hash function to map keys to indexes in an array, allowing for efficient retrieval and storage of values.
- Hash tables are often used for fast data lookup, such as in dictionaries or database indexing.

## Basic Hash Table Operations

1. **Insertion (Put)**: Adding a key-value pair to the hash table.

2. **Retrieval (Get)**: Finding and returning the value associated with a given key.

3. **Deletion (Remove)**: Removing a key-value pair from the hash table.

4. **Existence Check (Contains)**: Checking if a key exists in the hash table.

5. **Collision Handling**: Addressing cases where multiple keys hash to the same index.

## Sample Hash Table Program in Java

```java
import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        // Creating a hash table
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insertion
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Retrieval
        int age = hashMap.get("Bob");
        System.out.println("Bob's age: " + age);

        // Deletion
        hashMap.remove("Alice");

        // Existence check
        boolean containsCharlie = hashMap.containsKey("Charlie");
        System.out.println("Contains Charlie: " + containsCharlie);
    }
}
