package Array;

public class PresentOrNot {
	
	public static boolean isPresent(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {34,65,7,84,98,35,62,74,83,74,34,45,76};
		int key = 74;
		System.out.println(isPresent(arr, key));
	}
}
