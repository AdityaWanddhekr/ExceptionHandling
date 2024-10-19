public class Exception_3
{
   /*
       ArrayIndexOutOfBoundsException: These exceptions occur when user try to access
       the value from array beyond its size or index value is greater than size of array.
   */

   public static void main(String[] args)
   {
      try
      {
         int a[]=new int[2];
         a[0]=1;
         a[1]=2;
         a[2]=3;
         System.out.println(a[1]);
      }
      catch(ArrayIndexOutOfBoundsException ex)
      {
         System.out.println("Check the array index \n error is : "+ex);
      }
   }
}