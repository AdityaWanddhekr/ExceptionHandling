public class Exception_9
{
   // 4) Write a program to illustrate throw an Exception inside main function

   public static void Vote(int age){
        if(age>18)
        {
           throw new ArithmeticException("Person is Eligible to vate.");
        }
        else
        {
           System.out.println("Not Eligible!...");
        }
   }
   public static void main(String[] args)
   {
      Vote(23);
   }
}
