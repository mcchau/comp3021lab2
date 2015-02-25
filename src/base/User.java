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

}
