import java.util.*;
public class Exception_5
{
   // InputMismatchException.

   public static void main(String[] args)
   {
      try 
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("div = "+a/b);
      }
      catch(Exception ex)
      {
        System.out.println("error is : "+ex);
      }
      


     /*catch(ArithmeticException ex)
      {
        System.out.println("error is : "+ex);
      }*/
      
   }
}