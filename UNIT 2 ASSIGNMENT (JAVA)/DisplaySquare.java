class CalculateSquare {
	int a;

	CalculateSquare()
	{
		a = 10;
	}

	void Display()
	{
		System.out.println("The Square of " + a + " is " + (a*a));
	}

	void Display(int no)
	{
		System.out.println("The Square of " + no + " is " + (no*no));
	}

	void Display(float f)
	{
		System.out.println("The Square of " + f + " is " + (f*f));
	}
}

class DisplaySquare {
	public static void main(String[] args) {
		CalculateSquare c1 = new CalculateSquare();
		c1.Display();
		c1.Display(12);
		c1.Display(19.02f);
	}
}