import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {   
        Scanner ob=new Scanner(System.in);

        System.out.println("If enter 1 then area of a square will be print");
		System.out.println("If enter 2 then area of a circle will be print");
		System.out.println("If enter 3 then area of a rectangle will be print");
		System.out.println("By default area of a triangle will be print");
		System.out.print("enter the number to print areas = ");
		int a=ob.nextInt();
		switch (a)
        {
            case '1':
                
                    System.out.println("enter the length of square:");
                    int area=ob.nextInt();
                    int c=area*area;
                    System.out.println("the area of square is:"+c);
                    break;
                

            case '2':
                
                    System.out.println("enter the redias of a circle:");
                    double redias=ob.nextInt();
                    double d=3.14*redias*redias;
                    System.out.println("the area of circle is:"+d);
                    break;

                

            case '3':
                
                    System.out.println("enter the length of rectengle:");
                    Float rec=ob.nextFloat();
                    System.out.println("enter the breath of rectengle:");
                    Float rect=ob.nextFloat();
                    Float e=rec*rect;
                    System.out.println("the rectengle is:"+e);
                    break;
                

            default :
                
                    System.out.println("enter the base of triangle:");
                    Float tri=ob.nextFloat();
                    System.out.println("enter the height of triangle:");
                    Float tria=ob.nextFloat();
                    Float f=(tria*tri)/2;
                    System.out.println("the area of triangle is:"+f);
                    break;
                
        }
    }
}
