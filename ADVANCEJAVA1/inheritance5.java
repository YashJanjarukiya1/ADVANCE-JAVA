abstract class car
{
   abstract void run();
    
    void play()
    {
        System.out.println("play music loudly........");
    }
}

class bike extends car
{
    void run()
    {
        System.out.println("running safetly..........");
    }
}

class inheritance5
{
    public static void main(String args[])
    {
       bike b=new bike();
       b.run();
       b.play();
    }
}
