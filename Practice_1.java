import java.util.*;
public class Practice_1
{
   //  Write a program to illustrate the simple try catch functions .

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
          System.out.println("c : "+c);
       }
       catch(ArithmeticException ex)
       {
          System.out.println("Check the denominater 0 or not. \n error is : "+ex);
       }
   }
}