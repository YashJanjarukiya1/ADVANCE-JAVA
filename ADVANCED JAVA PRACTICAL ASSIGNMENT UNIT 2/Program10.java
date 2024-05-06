//Write a program to store elements in Hashset and search a particular element in it
import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        System.out.println("Elements in the HashSet: " + hashSet);

        String elementToSearch = "Orange";
        if (hashSet.contains(elementToSearch)) {
            System.out.println("\n'" + elementToSearch + "' found in the HashSet.");
        } 
        else {
            System.out.println("\n'" + elementToSearch + "' not found in the HashSet.");
        }
    }
}
