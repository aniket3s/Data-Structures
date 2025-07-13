package String;

public class ReverseStr {
	public static void main(String[] args) {
		String str = "docker";
		
		int i = str.length()-1;
		String rev = "";
		while(i>=0) {
			rev += str.charAt(i);
			i--;
		}
		System.out.println(rev);
	}
}
