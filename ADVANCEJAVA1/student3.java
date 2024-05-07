class Student 
{
    String name;
    int id;

Student3(String name,int id)
{
    name=n;
    id=i;
}
void display()
{
    System.out.println(name+ " "+ id);
}

    public static void main(String args[])
    {
        student s1=new student("Yash",1);
        student s2=new student("Shreya",2);
        s1.display();
        s2.display();
    }
}

