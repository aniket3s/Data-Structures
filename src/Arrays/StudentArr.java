package Arrays;


public class StudentArr {
	
	public static void main(String[] args)
	{
		Student [] db = new Student[2];
		
		db[0] = new Student("aniket",21);
		db[1] = new Student("sanket",21);
		
		for (int i = 0; i < db.length; i++) {
			
			System.out.println(db[i]);
		}
	}
}
