package Arrays;

public class CommitRoleBackDriver {
	
	public static void main(String[] args) {
		
		CommitRoleBack c1 = new CommitRoleBack();
		
		c1.addName("alaen");
		c1.addName("martin");
		c1.removeName("scott");
		
		
		c1.roleBack(1);
		
		c1.commit();
		
		c1.roleBack(2);
		c1.printDB();	
	}
}
