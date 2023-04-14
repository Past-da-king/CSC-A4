
class binaryTree
{
   account value;
   binaryTree right;
   binaryTree left;
   
   public binaryTree( account acc)
   {
      this.value=acc;
      this.right=null;
      this.left=null;
   }
   
   public void insertRight(binaryTree node)
   {
      this.right=node;
   }
   
   public void insertLeft(binaryTree node)
   {
      this.left=node;
   }
   
   public binaryTree getRight()
   {
      return this.right;
   }
   
   public binaryTree getLeft()
   {
      return this.left;
   }
   
   public void insert(binaryTree node)
   {
      
      if( value.toString().compareTo(node.value.toString())<0)
      {
         if (getRight()==null)
         {
            insertRight(node);
         }
         else
         {
            getRight().insert(node);
         }      
      }
      else
      {
         if(getLeft()==null)
         {
            insertLeft(node);
         }
         else
         {
            getLeft().insert(node);
         }
      }
   
   }

   public void print()
   {
      System.out.println(value);
      if (getRight()!=null)
      {
         getRight().print();
      }
      if (getLeft() !=null)
      {
         getLeft().print();
      }
   }
    
   public boolean check()
   {
      int n=0;
      while(getRight()!=null)
      {
         n++;
      }
      if (getRight()==null && getLeft()!=null){n+=1;}
      
     
      int v=0;
      while(getLeft()!=null)
      {
         v++;
      }
      if (getLeft()== null && getRight()!=null){n+=1;}
      
      return  (n-v==1 || n-v==0 )||(v-n==1 || v-n==0);
      
      
   }
    
   public void balance()
   {
      
   
   }
}


