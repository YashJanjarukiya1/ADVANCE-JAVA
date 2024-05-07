import java.util.*;

public class Listdemo1
{
    public static void main(String args[])
    {
        List<String> L=new ArrayList<String>(5);
        L.add("yash");
        L.add("for");
        L.add("yash");

        System.out.println("first index of yash:"+L.indexOf("yash"));
        System.out.println("last index of yash:"+L.lastIndexOf("yash"));
        System.out.println("index of that element it was not available:"+L.indexOf("hello"));
    }
}