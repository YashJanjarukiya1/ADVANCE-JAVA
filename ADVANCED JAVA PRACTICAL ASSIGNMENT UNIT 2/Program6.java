//Write a program showing various methods of HashMap class
import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        System.out.println("Elements in the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        String keyToCheck = "Three";
        System.out.println("\nIs '" + keyToCheck + "' present? " + hashMap.containsKey(keyToCheck));

        int valueToCheck = 3;
        System.out.println("Is value '" + valueToCheck + "' present? " + hashMap.containsValue(valueToCheck));

        String keyToGet = "Two";
        int value = hashMap.get(keyToGet);
        System.out.println("\nThe value for key '" + keyToGet + "' is: " + value);

        String keyToRemove = "Four";
        hashMap.remove(keyToRemove);
        System.out.println("\nHashMap after removing key '" + keyToRemove + "':");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Set<String> keys = hashMap.keySet();
        System.out.println("\nKeys in the HashMap: " + keys);

        System.out.println("Values in the HashMap: " + hashMap.values());
    }
}
