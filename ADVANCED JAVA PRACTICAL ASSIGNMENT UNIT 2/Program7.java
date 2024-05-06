//Write a program showing various methods of TreeMap class
import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);
        treeMap.put("Five", 5);
        treeMap.put("Four", 4);

        System.out.println("Elements in the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        String keyToCheck = "Three";
        System.out.println("\nIs '" + keyToCheck + "' present? " + treeMap.containsKey(keyToCheck));

        int valueToCheck = 3;
        System.out.println("Is value '" + valueToCheck + "' present? " + treeMap.containsValue(valueToCheck));

        String keyToGet = "Two";
        int value = treeMap.get(keyToGet);
        System.out.println("\nThe value for key '" + keyToGet + "' is: " + value);

        String keyToRemove = "Four";
        treeMap.remove(keyToRemove);
        System.out.println("\nTreeMap after removing key '" + keyToRemove + "':");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nFirst key-value pair: " + treeMap.firstEntry());
        System.out.println("Last key-value pair: " + treeMap.lastEntry());

        Set<String> keys = treeMap.keySet();
        System.out.println("\nKeys in the TreeMap: " + keys);

        System.out.println("Values in the TreeMap: " + treeMap.values());
    }
}
