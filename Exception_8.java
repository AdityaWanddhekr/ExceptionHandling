import java.util.*;
public class Exception_8
{
   // Write a program to illustrate nested try catch.

   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String : ");
     String str=sc.nextLine();

     try
     {
        int num=Integer.parseInt(str);
        System.out.println("Enter the number 2 : ");
        int num2=sc.nextInt();
        try
        {
           int c=num/num2;
           System.out.println("c = "+c);
        }
        catch(ArithmeticException ex)
        {
           System.out.println("Error is : "+ex);
        }
     } 
     catch(NumberFormatException ex)
     {
        System.out.println("Error is : "+ex);
     }
   }
}