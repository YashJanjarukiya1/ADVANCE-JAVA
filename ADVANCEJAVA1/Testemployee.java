class Employee
{
    int id;
    String name;
    double salary;

    void insert(int i,String n,double s)
    {
        id=i;
        name=n;
        salary=s;
    }

    void display()
    {
        System.out.println(id +" " +name+ " " + salary);
    }
}

 class Testemployee
{
     public static void main(String args[])
{
     
     Employee e1=new Employee();
     Employee e2=new Employee();
     Employee e3=new Employee();

     e1.insert(1,"yash",50000);
     e2.insert(2,"harit",20000);
     e3.insert(3,"dhaval",30000);

     e1.display();
     e2.display();
     e3.display();

}
}