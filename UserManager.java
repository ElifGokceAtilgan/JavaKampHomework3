package homework3;


public class UserManager {
   public void add(User user) {
	   System.out.println(" user added .");
   }
 
   public void delete() {
	   System.out.println(" User deleted.");
	   }
   public void update() {
	   System.out.println(" User profile updated.");
   }
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}

}
