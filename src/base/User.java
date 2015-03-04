package base;

import java.util.Date;

public class User {
		
		private int userID;
		private String userName;
		private String userEmail;
		
		public User(int ID, String Name, String Email){
			
			userID = ID;
			userName = Name;
			userEmail = Email;
			
		}
		
		public int getuserID(){
			
			return userID;
			
		}
		
	   public void setuserID(int ID){
			
		   userID = ID;
			
		}
	   
	   public String getuserName(){
			
			return userName;
			
		}
	   
	   public void setuserName(String Name){
			
       userName = Name;
			
		}
	   
	   
	   public String getuserEmail(){
			
			return userEmail;
			
		}
	   
	   public void setuserEmail(String email){
			
	       userEmail = email;
				
			}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userID;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userID != other.userID)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
