package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
	
	static Scanner sc ;
	
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("enter thre size");
		int len = sc.nextInt();
		
		System.out.println(Arrays.toString(InputArray(len)));	
	}
	
	public static int[] InputArray(int len) {
		int [] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the "+i+" number ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
