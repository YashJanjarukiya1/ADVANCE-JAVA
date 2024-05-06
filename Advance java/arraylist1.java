import java.util.*;

class student
{
	int roll;
	String name;
	int age;

	public student(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	
}

class arraylist1
{
	public static void main(String args[])
	{
		student s=new student(10,"yash",20);
		student s1=new student(45,"tanvi",19);
		student s2=new student(12,"dhaval",23);

		ArrayList<student> a=new Arraylist<student>();
		a.add(s);
		a.add(s1);
		a.add(s2);

		for(student st:a)
		{
			System.out.println(st.roll+" "+st.name+" "+st.age);
		}
	}
}