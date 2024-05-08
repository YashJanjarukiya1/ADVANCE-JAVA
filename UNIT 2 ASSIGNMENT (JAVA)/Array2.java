import java.util.*;

class Array2 {
	void maximum(int[] array)
	{
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("The Maximum element of array is " + max);
	}

	public static void main(String[] args) {
		int a[] = {10,12,01,30,15};

		Array2 a1 = new Array2();

		a1.maximum(a);
	}
}
	
