package Arrays;

import java.util.Arrays;

public class QuickSort2 {
	
	public static void quickSort(int[] ar, int start,int end){
		if (start<end) {
			int j = partition(ar,start,end);
			quickSort(ar, start, j);
			quickSort(ar, j+1, end);
		}
	}

	public static int partition(int[] ar, int start, int end) {
		int ref = ar[start];
		int i = start, j = end;
		
		while (i<j) {
			do {
				i++;
			}
			while(ar[i]<=ref);
			
			do {
				j--;
			}
			while(ar[i]>ref);
			
			if(i<j) {
				swap(ar,ar[i],ar[j]);
			}
		}
		swap(ar,ar[start],ar[j]);
		return j;
	}
	public static void swap(int[]ar,int i,int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	public static void main(String[] args) {
		int[] ar = {10,6,5,3,7,5,4,2,7,9,96,3};
		quickSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
}
