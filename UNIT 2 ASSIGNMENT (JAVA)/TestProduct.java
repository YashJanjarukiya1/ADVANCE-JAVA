class Product {
	String pname,mname;
	long pcode;

	Product(String n,long p,String m)
	{
		pname = n;
		pcode = p;
		mname = m;
	}

	void ShowInformation()
	{
		System.out.println("The Product Name is " + pname);
		System.out.println("The Product Code is " + pcode);
		System.out.println("The Manufacturer Name is " + mname);
		System.out.println();
	}
}

class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product("Bottle",101,"Bisleri");
		Product p2 = new Product("Toothbrush",102,"Oral-B");
		Product p3 = new Product("Laptop",103,"HP");

		p1.ShowInformation();
		p2.ShowInformation();
		p3.ShowInformation();
	}
}