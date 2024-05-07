class student4
{
    String name;
    int id;

student4(String name,int id)
{
    this.name=n;
    this.id=i;
}

void display()
{
    System.out.println(name+ " "+ id);
}

public static void main(String args[])
{
    student4 s1=new student4("Yash",1);
    student4 s2=new student4("shreya",2);
    s1.display();
    s2.display();
}

}
