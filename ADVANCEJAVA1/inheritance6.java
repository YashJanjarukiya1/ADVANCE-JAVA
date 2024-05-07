abstract class room
{
   abstract void bedroom();
    
    void kitchen()
    {
        System.out.println("kitchen is very clean.............");
    }
} 

class hall extends room
{
    void bedroom()
    {
        System.out.println("bedroom is too big............");
    }
}

class inheritance6
{
    public static void main(String args[])
    {
        hall h=new hall();
        h.kitchen();
        h.bedroom();
    }
}