//Write a program for adding 10 elements in a Arraylist and display them using
//ListIterator.
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add("Element " + i);
        }

        System.out.println("Elements in the ArrayList:");

        ListIterator<String> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
