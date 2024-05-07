class student
{
    void details()
    {
        System.out.println("students name is yash janjarukiya:");
    }
}

class parents extends student()
{
    void parentsdetails()
    {
        System.out.println("parents name is dilipbhai:");
    }
}

class inheritance11
{
    public static void main(String args[])
    {
        babydog b=new babydog()
        b.details();
        b.parentsdetails();
        b.weep();
    }
}
