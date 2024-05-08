import java.util.*;

class Array {
	void get()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 values : ");
		int[] a = new int[10];

		for (int i = 0;i < 10 ;i++ ) {
			a[i] = sc.nextInt();
		}

		for (int i = 0 ; i < 10;i++ ) {
			System.out.println(a);
		}

		for (int i = 0;i < 10 ;i++ ) {
			if (a[i] > a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}

		/*for (int i = 0;i < 10 ;i++ ) {
			System.out.print(" " +);
		}*/
	}

	public static void main(String[] args) {
		Array a1 = new Array();
		a1.get();
	}
}