// Write a program for adding 10 elements in a TreeMap and display them.
import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 1; i <= 10; i++) {
            treeMap.put(i, "Element " + i);
        }

        System.out.println("Elements in the TreeMap:");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
