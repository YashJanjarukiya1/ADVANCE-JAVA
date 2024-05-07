class student
{
    void details()
    {
        System.out.println("students name is yash janjarukiya:");
    }
}

class Parents extends student
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

        Parents p=new Parents();
        p.details();
        p.parentsdetails();
        
    }
}
