class Pyramid {

	void display()
	{
		int no = 1;
		for (int i = 0;i < 5;i++) {
			for (int j = 0;j <= i;j++) {
				System.out.print(" " + no + " ");
				no++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pyramid p1 = new Pyramid();

		p1.display();
	}
}