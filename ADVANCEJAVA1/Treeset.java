import java.util.*;

class Treeset
{
    public static void main(String args[])
    {
        Treeset<String> ts=new Treeset<String>();
        ts.add("Y");
        ts.add("A");
        ts.add("S");
        ts.add("H");

        System.out.println(ts);

        for(String S:ts)
        System.out.println(S);

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
    }
}