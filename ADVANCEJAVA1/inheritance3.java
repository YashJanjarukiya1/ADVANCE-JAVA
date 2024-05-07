class Animal
{
    void Animalsound()
    {
        System.out.println("animal sound like a.........");
    }
}

class dog extends Animal
{
    void Animalsound()
    {
        super.Animalsound();
        System.out.println("wow wow wow..............");
    }
}

class inheritance3
{
    public static void main(String args[])
    {
        dog d=new dog();
        d.Animalsound();
    }
}