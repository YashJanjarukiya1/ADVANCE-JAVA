
public class Listdemo
{
    public static void main(String args[])
    {
        List l1=new ArrayList();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);

        List l2=new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);

        l1.addAll(1,12);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(3));

        l1.set(0,5);
        System.out.println(l1);
    }
}