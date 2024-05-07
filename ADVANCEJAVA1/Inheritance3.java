class Color
{
    String Color="red";
}

class Animal extends Color
{
    void print()
    {
        System.out.println(Color);
        System.out.println(super.Color);
    }
}
class Inheritance3
{
    public static void main(String args[])
    {
        Animal a=new Animal();
        a.print();
    }
}
