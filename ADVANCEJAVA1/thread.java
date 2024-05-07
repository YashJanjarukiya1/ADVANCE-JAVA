class thread1 extends thread 
{
    public void run()
    {
        System.out.println("the thread is running:");
    }

    public static void main(Strign args[])
    {
        thread1 t1=new thread1();
        t1.start();
    }
}
