 class bike
{
    final void run()
    {
        System.out.println("bike is running...................");
    }
}

class inheritance13 extends bike
{
    void run1()
    {
        super.run();
        run();
        System.out.println("running safetly with 1000km/hr");
    }

    public static void main(String args[])
    {
        inheritance13 honda=new inheritance13();
        honda.run();
        honda.run1();
    }
}
