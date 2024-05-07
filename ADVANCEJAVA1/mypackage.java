package packageyash;
public class mypackage
{
    public void getdata()
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the name:");
        String n=ob.nextInt();

        System.out.println("enter the rollno:");
        int r=ob.nextInt();

        System.out.println("enter the mobilenumber:");
        double m=ob.nextdouble();

    }

    public void putdata()
    {
        System.out.println("the name is:"+n);
        System.out.println("the roll is:"+r);
        System.out.println("the mobilenumber is:"+m);

    }

}