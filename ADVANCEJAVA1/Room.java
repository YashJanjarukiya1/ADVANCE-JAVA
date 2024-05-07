class Room
{
    int length;
    int breath;

    void insert(int l,int b);
    {
        length=l;
        breath=b;

    }

    void calculate()
    {
        System.out.println(length*breath);
    }
}

public class Room1
{
    public static void main(String args[])
    {
        Room r1=new Room();
        Room r2=new Room();

        r1.insert(40);
        r2.insert(50);

        r1.calculate();
        r2.calculate();
    }
}
