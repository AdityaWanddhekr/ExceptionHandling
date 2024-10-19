public class Exception_10
{
  // Write a program to illustrate re-throw an Exception inside a member function of a class

  public static void main(String[] args)
  {
      int a=10;
      int b=0;
 
      try{
          int c=a/b;
          System.out.println("c = "+c);
      }
      catch(Exception ex)
      {
          throw ex;
      }
  }
}