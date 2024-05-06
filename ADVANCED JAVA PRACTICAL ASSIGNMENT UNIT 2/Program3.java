//Write a program for adding 10 elements in a HashMap and display them.
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            hashMap.put(i - 1, "Element " + i);
        }

        System.out.println("Elements in the HashMap:");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
