import java.util.*;

class account
{
     private String name;
     private String description;
     private List<String> posts = new ArrayList<>();
     
     public account(String Name , String bio)
     {
         name =Name;
         description= bio;
         
     }
     
     public void addpost(String Post)
     {
         posts.add(Post);
     }
     
     public String getName()
     {
         return this.name;
     }


     
     public void allPosts()
     {   
         for (String post:posts)
         {  
             
       
            String sub1= post.substring(post.indexOf(" ")+1,post.length());
            String sub2=sub1.substring(sub1.indexOf(" ")+1,sub1.length());
            System.out.println("Title:"+sub2 +
                              "\nVideo: "+post.substring(0,post.indexOf(" "))+
                              " \nNumber of likes:" +sub1.substring(0,sub1.indexOf(" "))
                              );

         }
     }
     public String toString()
     {
         return name;
     }
     public void printAccount()
     {
         System.out.println( " Enter the account name:" + this.name +"\nThe profile description is:"+ this.description);      
     }
      
    public void blance()
    {
     
    
    }
}