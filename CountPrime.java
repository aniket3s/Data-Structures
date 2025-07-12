package Array;

public class CountPrime {
	
	public static boolean isPrime(int num){
		int den = 2;
		
		while(den<num){
			if (num%den == 0){
				break;
			}
			den++;
		}
		return num==den;
	}
	public static void main(String[] args)
	{
		int cnt = 0;
		int [] arr = {2,5,7,87,34,5};
		
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
