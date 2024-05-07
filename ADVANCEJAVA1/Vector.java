import java.util.*;
public class Vector
{
    public static void main(String args[])
    {
    
    Vector <String> vec_tor=new Vector <String>();

    vec_tor.add("yash");
    vec_tor.add("janjarukiya");
    vec_tor.add("yash");

    System.out.println("the Vector is:"+vec_tor);

    vec_tor.add("last");
    vec_tor.add("element");

    System.out.println("the object is replaced is:"+vec_tor.set(2,"yash"));
    System.out.println("the object is replaced is:"+vec_tor.set(4,"50"));

    System.out.println("the new vector is:"+vec_tor);

    


    }
}
