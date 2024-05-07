import java.util.Scanner;
class Student
{
    public static void main(String args[])
    {  
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the stu_name:");
        String name=ob.nextLine();

        System.out.println("enter the stu_no:");
        int num=ob.nextInt();

        System.out.println("enter the stu_sub1marks:");
        int sub1=ob.nextInt();
        
        System.out.println("enter the stu_sub2marks:");
        int sub2=ob.nextInt();

        System.out.println("enter the stu_sub3marks:");
        Float sub3=ob.nextFloat();

        Float total=sub1+sub2+sub3;
        
        Float per=(total*100)/300;

        System.out.println("the stu_no is:"+num);
        System.out.println("the stu_name is:"+name);
        System.out.println("the stu_sub1marks is:"+sub1);
        System.out.println("the stu_sub2marks is:"+sub2);
        System.out.println("the stu_sub3marks is:"+sub3);
        System.out.println("the total is:"+total);
        System.out.println("the percentage is:"+per);

    }
}
