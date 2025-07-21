package Arrays;

import java.util.Arrays;

/*
  finding the union of two array 
  we are given two arrays
  a[] = {2,3,5,7,11,13};
  b[] = {1,3,5,7,9};
  
  return  {1,2,3,5,7,9,11,13};
  */
public class Union {
	public static int[] unionArray(int[]a,int[]b) {
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i]!=-1) {
				for (int j = 0; j < b.length; j++) {
					if (a[i]==b[j]) {
						a[i]=-1;
						cnt++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int[] ans = new int[(a.length+b.length)-cnt];
		for (int i = 0,j=0; i < ans.length; i++) {
			if (i<b.length) {
				ans[i] = b[j];
				j++;
			}
			else if (i-b.length!=-1) {
				ans[i] = a[i-b.length];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] a = {2,3,5,6,7};
		int[] b = {1,3,5,7,9};
		System.out.println(Arrays.toString(unionArray(a, b)));
	}
}
