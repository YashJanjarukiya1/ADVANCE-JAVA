class student
{
    String name;
    int id;
    int roll;
}

class student1
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Yash";
        s1.id=1;
        s1.roll=15;

        System.out.println(s1.name+" "+s1.id+" "+s1.roll);
    }
}
