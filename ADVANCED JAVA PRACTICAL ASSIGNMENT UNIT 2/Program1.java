//Write a program for adding 10 elements in a Linkedlist and display them using foreach
//loop.
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            linkedList.add("Element " + i);
        }

        System.out.println("Elements in the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
