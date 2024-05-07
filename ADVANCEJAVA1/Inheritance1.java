class Hello
{
    void get()
    {
        System.out.println("hello");
    }
}

class World extends Hello
{
    void put()
    {
        System.out.println("Good morning everyone:");
    }
}

class Inheritance1
{
    public static void main(String args[])
    {
        World w=new World();
        w.get();
        w.put();
    }
}