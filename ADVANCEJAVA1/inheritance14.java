abstract class honda
{
    void bike()
    {

    }

}

class car extends honda
{
     void bike()
    {
        System.out.println("the car is running...........");
    }
}

class inheritance14
{
    public static void main(String args[])
    {
        car c=new car();
        c.bike();
    }
}