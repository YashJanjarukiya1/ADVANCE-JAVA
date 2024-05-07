import java.util.*;

class Queue
{
    public static void main(String args[])
    {
        Queue<Long> l3=new LinkedList <Long>();
        l3.add(new Long(1));
        l3.add(new Long(2));
        l3.add(new Long(3));
        l3.add(new Long(4));

        for(Long b:l3)
        System.out.println(b);

        System.out.println("first element:"+l3.peek());
        System.out.println("remove first element:"+l3.poll());
        System.out.println(l3);
    }
}