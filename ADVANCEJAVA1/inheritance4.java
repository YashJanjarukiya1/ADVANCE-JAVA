class bike
{
   final void run()
    {
       System.out.println("running.....");
    }
}

class car extends bike
{
    void run1()
    {
        System.out.println("running safetly........");
    }
}

class inheritance4
{
    public static void main(String args[])
    {
        car c=new car();
        c.run();
        c.run1();
    }
}