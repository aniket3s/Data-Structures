package Array;

public class Repetation {
	
	public static int repetations(int[] arr, int key)
	{
		int repetation = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]== key) {
				repetation+=1;
			}
		}
		return repetation ;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,4,2,5,6,7,3,3,4,5,3,1,6,4,7,4};
		
		System.out.println(repetations(arr, 3));
	}

}
