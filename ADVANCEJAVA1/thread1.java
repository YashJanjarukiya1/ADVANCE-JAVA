class MYTHREAD
{
    public void run()
    {
        System.out.println("thread is running mode............");
    }
}

class thread1 extends MYTHREAD
{
    public void run1()
    {
        System.out.println("thread is always run.............");
    }
}
class thread3
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        t1.start();
    }
}


