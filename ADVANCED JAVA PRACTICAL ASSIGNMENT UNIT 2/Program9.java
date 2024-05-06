//Write a program to add elements in vectors and display them using enumerators.
import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");
        vector.add("Element 4");
        vector.add("Element 5");

        System.out.println("Elements in the Vector:");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
