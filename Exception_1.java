import java.util.*;
public class Exception_1
{
   /*
      ArithmeticException: this is the inbuilt class present in java.
      lang package which is used for or which help us to handle the
      ArithmeticException or Arithmetic related problem like as divide by zero etc
   */
 
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the a : ");
      int a=sc.nextInt();
      System.out.println("Enter the b : ");
      int b=sc.nextInt();
 
      try
      {
          int c=a/b;
          System.out.println("c = "+c);
      }
      catch(ArithmeticException ex)
      {
         System.out.println("Error is :  "+ex);
      }
   }

}