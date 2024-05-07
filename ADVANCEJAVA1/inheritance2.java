class Bank
{
    void getrateofintrest();
    {
        return 0;
    }
}

class SBI extends Bank
{
    void getrateofintrest();
    {
        return 1;
    }
}

class BOB extends Bank
{
    void getrateofintrest();
    {
        return 2;
    }
}

class CEN extends Bank
{
    void getrateofintrest();
    {
        return 3;
    }
}

class KOTAK extends Bank
{
    void getrateofintrest();
    {
        return 4;
    }
}

class inheritance2
{
    public static void main(String args[])
    {
        SBI s=new SBI();
        BOB b=new BOB();
        CEN c=new CEN();
        KOTAK k=new KOTAK();

        System.out.println("SBI rate of intrest is:"+s.getrateofintrest());
        System.out.println("BOB rate of intrest is:"+b.getrateofintrest());
        System.out.println("CEN rate of intrest is:"+c.getrateofintrest());
        System.out.println("KOTAK rate of intrest is:"+k.getrateofintrest());
    }
}
