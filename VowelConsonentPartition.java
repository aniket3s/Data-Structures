package Array;

public class VowelConsonentPartition {
	
	public static char[] ans(char[] a)
	{
		int i = 0, j = a.length-1;
		
		while(i<=j)
		{
			if((a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') &&
					(a[j] == 'a' || a[j] == 'e' || a[j] == 'i' || a[j] == 'o' || a[j] == 'u'))
			{
				i++;
			}
			if((a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') &&
					(a[j] != 'a' || a[j] != 'e' || a[j] != 'i' || a[j] != 'o' || a[j] != 'u'))
			{
				i++;
				j--;
			}
			if((a[i] != 'a' || a[j] != 'e' || a[j] != 'i' || a[j] != 'o' || a[j] != 'u') &&
					(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u'))
			{
				char temp = 
				i++;
				j--;
			}
			
		}
		return a;
	}

}
