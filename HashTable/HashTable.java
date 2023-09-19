package HashTable;

import java.util.HashMap;

public class HashTable {

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
