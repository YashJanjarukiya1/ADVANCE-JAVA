class student
{
    String name;
    int id;

void data(String name,int id)
{
    name=n;
    id=i;
}

void display()
{
    System.out.println(name+ " "+ id);
}
}

class student2
{
    public static void main(String args[])
    {
        student s1=new student();
        student s2=new student();
        s1.data("Yash",1);
        s2.data("janvi",2);
        s1.display();
        s2.display();
    }
}

