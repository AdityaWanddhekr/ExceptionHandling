public class Exception_2
{
   /*
     NumberFormatException occur when we want to perform conversion between 
     string to number when we perform conversion between string to number and
     if any non numeric character present in string then we get run time exception
     called as NumberFormatException.
   */

   public static void main(String[] args)
   {
      try
      {
         String s="aditya";
         int a=Integer.parseInt(s);
         System.out.println("A = "+a);
      }
      catch(NumberFormatException ex)
      {
          System.out.println("Please check the String data : \n error is : "+ex);
      }
   }
}