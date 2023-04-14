import java.util.*;

class main
{
   public static void main(String ... Args)
   {
      List<account> accounts= new ArrayList<>();
      account user1= new account ("ayanda", "im coot ithink");
      accounts.add( new account ("Zara", "I love coding and cats")); 
      accounts.add( new account ("Leo", "I'm a rockstar programmer")); 
      accounts.add( new account ("Riya", "I'm a math whiz and a gamer")); 
      accounts.add( new account ("Max", "I'm a creative genius and a bookworm"));
      accounts.add( new account ("Kai", "I’m a sports fan and a music lover"));
      accounts.add( new account ("Luna", "I’m a star gazer and a dreamer"));
      accounts.add( new account ("Sam", "I’m a tech enthusiast and a traveler")); 
      accounts.add( new account ("Eva", "I’m a fashionista and a dancer"));
      accounts.add( new account ("Mia", "I’m a baker and a painter")); 
      accounts.add( new account ("Noah", "I’m a skateboarder and a writer")); 
      accounts.add( new account ("Zoe", "I’m a singer and a photographer")); 
      accounts.add( new account ("Eli", "I’m a magician and a comedian")); 
      accounts.add( new account ("Emma", "I’m a teacher and a gardener")); 
      accounts.add( new account ("Jack", "I’m a pilot and a chess player")); 
      accounts.add( new account ("Lily", "I’m a dancer and a yogi")); 
      accounts.add( new account ("Owen", "I’m a gamer and a hacker")); 
      accounts.add( new account ("Anna", "I’m a doctor and a poet"));
      accounts.add( new account ("Luke", "I’m a lawyer and a DJ"));
      binaryTree root= new binaryTree(user1);
      int i=0;
      for (account n:accounts)
      {
         root.insert(new binaryTree(n));
         
         System.out.println(i++);
      }
      System.out.println(root.left.left.left.left.right.left.value);
//       root.print();
//       
   
   }
}