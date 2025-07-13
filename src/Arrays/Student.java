package Arrays;

public class Student {
	
	
	String name;
	int id;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "name :"+name + ", id : "+id;
	}
}
