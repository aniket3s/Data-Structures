package Arrays;

import java.sql.Savepoint;

public class CommitRoleBack {

	static int savepintIndex = 0;
	
	public boolean removeName(String name)
	{
		int i;
		for (i = 0; i< db.length; i++) {
			if (db[i].equals(name)) {
				break;
			}
		}
		
		if(i<db.length) {
			String temp = new String [db.length-1];
			
			for (int j = 0; j < db.length; j++) {
				if(i<j) {
					temp[i] = db[j];
				}
				else if(j>i) {
					temp[j-1] = db[j];
				}
			}
			
			savepoint[savePointIndex] = db;
			savePointIndex++;
			db = temp;
			System.out.println(name+" removed!");
			
			return true;
		}
		return false;
	}
	
	public boolean addName(String name) {
		String[] temp = new String[db.length+1];
		
		for (int i = 0; i < db.length; i++) {
			temp[i] = db[i];
		}
		temp[db.length]= name;
		
		System.out.println(name_+" added");
		
		savaePoint[savePointIndex]= db;
		savePointIndex++;
		
		db = temp ;
		return true;
	}
	
	public boolean commit  
	{
		Arrays.fill(savePoint,null);
		savePointIndex= 0;
		return true;
	}
	
	public void roleBack(int steps)
	{
		if (steps>0 && steps<=10) {
			if (savePointIndex!=0) {
				
				db = Savepoint[savePointIndex-steps];
			}
			else
			{
				System.out.println("no savepoints available ");
			}
		}
		else
		{
			System.out.println("invalid roleback count !");
		}
	}
	
	public void printDB()
	{
		System.out.println(Arrays.toString(db));
	}
	
}







































