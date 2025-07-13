package Arrays;

import java.util.Arrays;

// make the entire array Even

public class EvenArray {

	public static int[] evenArray(int[]a)
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				a[i] +=1;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] arr = {53,3,5,7,9,43,56,1};
		System.out.println(Arrays.toString(evenArray(arr)));
	}
}
