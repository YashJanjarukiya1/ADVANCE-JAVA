class Demonstrate {
	private  int no;
	private  String name;
	Demonstrate(int no,String name)
	{
		this.no = no;
		this.name = name;
	}

	void display()
	{
		System.out.println(no + " " + name);
	}

	public static void main(String[] args) {
		Demonstrate d1 = new Demonstrate(101,"Parth");

		d1.display();
	}
}