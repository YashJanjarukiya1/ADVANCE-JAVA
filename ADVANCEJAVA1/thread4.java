class Thread4 extends Thread
{
    public void run()
    {
        System.out.println("running thread name is:"+thread.Currentthread().getName());
        System.out.println("running thread priority is:"+thread.Currentthread().getPriority());
    }

    public static void main(String args[])
    {
        Thread4 t1=new Thread4();
        Thread4 t2=new Thread4();

        t1.start();
        t2.start();

        t1.setPriority(thread.Min_priority);
        t2.setPriority(thread.Max_priority);
    }
}
