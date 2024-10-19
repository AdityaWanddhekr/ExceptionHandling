import java.util.*;
public class Exception_7
{
   // 2) Write a program to illustrate multiple catches.

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of a : ");
       int a=sc.nextInt();
       System.out.println("Enter the value of b : ");
       int b=sc.nextInt();

       try
       {
          int c=a/b;
          System.out.println("The c = "+c);
       }
       catch(NullPointerException ex)
       {
          System.out.println("Error is = "+ex);
       }
       catch(ArithmeticException ex)
       {
          System.out.println("Error is = "+ex);
       }
       catch(NegativeArraySizeException ex)
       {
          System.out.println("Error is = "+ex);
       }
   }
}