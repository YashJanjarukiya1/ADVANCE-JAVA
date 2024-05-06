import java.util.*;

class Stack
{
	public static void main(String args[])

	{
		Stack<Integer> i2=new Stack<Integer>();
		i2.push(new Integer(1));
		i2.push(new Integer(2));
		i2.push(new Integer(3));
		i2.push(new Integer(4));

		for(int a:i2)
			System.out.println(a);

		System.out.println("search the index values of 3:"+ i2.search(3));
		System.out.println("popped:"+i2.pop());


	}
}