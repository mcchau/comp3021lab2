package base;

import java.util.Date;

public class post {
	
	private Date date;
	private String content;
	
	public post(Date D, String C){
		
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
   
   public boolean equals(Object o){
	   
	   boolean ans = true;
	   
	   o.getClass();
	   post post1 = (post) this;
	   post post2 = (post) o;
	   
	   //if( this == null && o == null){return true;}
	   
	   if(post1.date == post2.date){
		   if(post1.content == post2.content)return true;
	   }
	   
	   ans = false;
	   return ans;
   }
   
   public int hashCode(){
	   int hashCode = 0;
	   
	   date.hashCode();
	   content.hashCode();
	   
	   return hashCode;
   }
   
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
   
   /*public static void main(String[] args){
	   post User = new post();
   }*/

}
