class StringBuffer Demo
{
    public static void main(String args[])
    {
       StrignBuffer sb=new StringBuffer();

       System.out.println("capacity is:"+sb.Capacity());
       System.out.println("Appended String:"+sb.Appended("123456789"));
       System.out.println("Length String:"+sb.Length());
       System.out.println("String reverse:"+sb.Reverse());
    }
}
