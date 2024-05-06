class Bankaccount
{
    String name;
    String typeofacc;
    int accno;
    int balance;

    void insert(String n,String t,int a,int b)
    {
        name=n;
        typeofacc=t;
        accno=a;
        balance=b;
    }

    void display()
    {
        System.out.println(name+ " " + typeofacc + " " + accno + " " + balance);
    }
}

public class Bankaccount1
{
    public static void main(String args[])
    {
        Bankaccount b1=new Bankaccount();
        Bankaccount b2=new Bankaccount();

        b1.insert("Yash","saving",12345678910,50000);
        b2.insert("Dhaval","saving",12345658910,150000);

    }
}