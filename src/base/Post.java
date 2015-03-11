package base;

import java.util.Date;

public class Post implements Comparable<Post>{
	
	private Date date;
	private String content;
	
	public Post(Date D, String C){
		
		date = D;
		content = C;
		
	}
	
	public String getContent(){
		
		return content;
		
	}
	
   public void setContent(String C){
		
		content = C;
		
	}
   
   public Date getdate(){
		
		return date;
		
	}
   
   public String toString(){
	   String date, detail, info;
	   date = getdate().toString();
	   detail = getContent();
	   info = date + " " + detail;
	   return info;
   }
   
   @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((content == null) ? 0 : content.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
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
	Post other = (Post) obj;
	if (content == null) {
		if (other.content != null)
			return false;
	} else if (!content.equals(other.content))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	return true;
}
   
   /*public int hashCode(){
	   int hashCode = 0;
	   
	   date.hashCode();
	   content.hashCode();
	   
	   return hashCode;
   }*/
   
   public boolean contain(String keyword){
	   boolean ans = false;
	   String date, content;
	   date = getdate().toString();
	   content = getContent();
	   
	   if (date.toLowerCase().indexOf(keyword.toLowerCase()) != -1 ) {
		   return ans = true;
	   }
	   
	   if (content.toLowerCase().indexOf(keyword.toLowerCase()) != -1 ) {
		   return ans = true;
	   }

	   return ans;
	   
   }

@Override
public int compareTo(Post p) {
	
	// TODO Auto-generated method stub
	return this.getdate().compareTo(p.getdate());
	
}
   


}
