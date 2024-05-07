class Bank
{
    int get rate of intrest()
    {
        return 0;
    }
}

class Sbi extends Bank
{
    int get rate of intrest()
    {
        return 8;
    }
}

class Icici extends Bank
{
    int get rate of intrest()
    {
        return 7;
    }
}

class Axis extends Bank
{
    int get rate of intrest()
    {
        return 9;
    }
}

class Inheritance2
{
    public static void main(String args[])
    {
        Sbi s=new Sbi();
        Icici i=new Icici();
        Axis a=new Axis();

        System.out.println("the sbi rate of intrest is:"+s.get rate of intrest());
        System.out.println("the sbi rate of intrest is:"+i.get rate of intrest());
        System.out.println("the sbi rate of intrest is:"+a.get rate of intrest());

    }
}