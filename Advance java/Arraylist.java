import java.util.*;

class Arraylist
{
	public static void main(String args[])

	{
		Arraylist<String> i=new Arraylist<String>(5);
		i.add("yash");
		i.add("patel");
		i.add("tanvi");
		i.add("patel");

		System.out.println("first index of yash is:"+i.indexOf("yash"));
		System.out.println("last index of yash is:"+i.LastindexOf("yash"));
		System.out.println("index of element not present:"+i.indexOf("janjarukiya_babariya"));
		
	}
}