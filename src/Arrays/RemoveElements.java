package Arrays;
import java.util.Arrays;
/*  
	a[] = {1,2,3,4,5,6};
	b[] = {3,5,2};
	Remove elements of b[] from a[]
	return  {1,4,6};
*/
public class RemoveElements {
   public static int[] removeElement(int[]a,int[]b) {
	   int cnt = 0;
	   for (int j = 0; j < b.length; j++) {
		for (int i = 0; i < a.length; i++) {
			if (b[j]==a[i]) {
				a[i]=-1;
				cnt++;
			}
		  }
	   }
	   int[] ans = new int[a.length-cnt];
	   for (int i = 0,j=0; i < a.length; i++) {
		if (a[i]!=-1) {
			ans[j] = a[i];
			j++;
		}
	}
	  return ans; 
   }
   public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6};
	int[] b = {3,5,2};
	System.out.println(Arrays.toString(removeElement(a, b)));
   }
}
