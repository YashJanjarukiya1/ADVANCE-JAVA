import java.util.*;
class Manager
{
    int id,name,salary;
    public:
    
    static void get()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the name:");
        String n=sc.nextInt();

        System.out.println("enter the id:");
        int i=sc.nextInt();

        System.out.println("enter the salary:");
        int s=sc.nextInt();

        Manager m=new Manager();

        System.out.println("your name is:"+n);
        System.out.println("your id is:"+i);
        System.out.println("your salary is:"+s);


        
        






    }
    
} 
   public static void main(String args[])

  {

     m.get();
  }