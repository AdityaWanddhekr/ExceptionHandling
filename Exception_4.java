public class Exception_4
{
   /*
      NullPointerException occur when use any reference without memory allocation
      or without new keyword then NullPointerException get occur.
   */

   static int a[];
   public static void main(String[] args)
   {
      try
      {
        a=new int[-12];
        System.out.println("The a is : "+a);
      }
      catch(NegativeArraySizeException ex)
      {
        System.out.println("Check array size \n error is : "+ex);
      }
   }
}