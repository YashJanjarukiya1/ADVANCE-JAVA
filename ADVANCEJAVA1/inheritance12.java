class car
{
    final void race()
    {
        System.out.println("car is racing...................");
    }
}

class inheritance12 extends car
{
    void race1()
    {
        super.race();
        race();
        System.out.println("car is racing on 140km/hr");
    }

    public static void main(String args[])
    {
        inheritance12 audi=new inheritance12();
        audi.race();
        audi.race1();
    }
}
