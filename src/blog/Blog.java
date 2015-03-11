package blog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

import base.*;

public class Blog {
	
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User U){
		user = U;
		allPosts = new ArrayList<Post>();
	}
	
	public void setUser(User U){
		user = U;
	}
	
	public User getUser(){
		return user;
	}
	
	public void post(Post p){
	    allPosts.add(p);
	   // if(allPosts.contains(p)){
	    	System.out.println("A new Post: ");
	    	System.out.println(p.getdate().toString());
	    	System.out.println(p.getContent());
	    //}
	}
	
	public void list(){
		System.out.println("Current posts:");
		for(int i = 0; i < allPosts.size(); i++){
			System.out.println(allPosts.get(i).toString());
		}
	}
	
	public void delete(int index){
		if(index < 0 || index >= allPosts.size())
			System.out.println("Invaild index input");
		else
			allPosts.remove(index);
	}
	
	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
    
    public void search(int month, String someone){
    	Calendar cal = Calendar.getInstance();
    	
    	for (Post p : allPosts){
    		cal.setTime(p.getdate());
    		int postMonth = cal.get(Calendar.MONTH);
    		
    		if((postMonth+1 == month) && p.getContent().contains(someone)){
    			System.out.println(p);
    		}   		    		
    	}
    }
    
    public void setPosts( ArrayList<Post> allPost2){
    	allPosts = allPost2;
    }
	

}
