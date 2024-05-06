//Write a program showing various methods of HashSet class.
import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        System.out.println("Elements in the HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String elementToCheck = "Orange";
        System.out.println("\nIs '" + elementToCheck + "' present? " + hashSet.contains(elementToCheck));

        String elementToRemove = "Banana";
        hashSet.remove(elementToRemove);
        System.out.println("\nHashSet after removing '" + elementToRemove + "':");
        for (String element : hashSet) {
            System.out.println(element);
        }

        System.out.println("\nSize of the HashSet: " + hashSet.size());

        hashSet.clear();
        System.out.println("\nHashSet after clearing:");
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
    }
}
