/*
 Collection Interface Java Collection Framework ka root interface hai jo 
 objects ke group ko store aur manipulate karne ke liye methods define karta hai. 
 Ye java.util.Collection package me available hota hai.


 All Methods in Collection Interface

Basic Operations:   add(), remove(), clear(), size()
Query Methods:      isEmpty(), contains(), containsAll(), iterator()
Bulk Operations:     addAll(), removeAll(), retainAll()
Array Operations:    toArray()
Stream Operations:    stream(), parallelStream()


 * 
 * 
 * 
 */
import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // Basic Operations
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        System.out.println("Collection: " + collection); // [Apple, Banana, Cherry]

        // Size
        System.out.println("Size: " + collection.size()); // 3

        // Query Operations
        System.out.println("Contains Banana? " + collection.contains("Banana")); // true
        System.out.println("Is Empty? " + collection.isEmpty()); // false

        // Removing an element
        collection.remove("Banana");
        System.out.println("After removing Banana: " + collection); // [Apple, Cherry]

        // Converting to Array
        Object[] array = collection.toArray();
        System.out.println("Array: " + Arrays.toString(array)); // [Apple, Cherry]

        // Clearing the collection
        collection.clear();
        System.out.println("Is Empty after clear? " + collection.isEmpty()); // true
    }
}
