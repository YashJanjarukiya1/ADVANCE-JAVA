class Room
{
    int length;
    int weight;

    void insert(int l,int w)
    {
        length=l;
        weight=w;

    }

    void calculate()
    {
        System.out.println(length*weight);
    }
}

public class Room1
{
    public static void main(String args[])
    {
        Room r1=new Room();
        Room r2=new Room();

        r1.insert(40,20);
        r2.insert(50,10);

        r1.calculate();
        r2.calculate();
    }
}
