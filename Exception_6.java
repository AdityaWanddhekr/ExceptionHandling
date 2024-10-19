class Div
{
   void getDiv(int a,int b)throws Exception
   {
       int c=a/b;
       System.out.println("c = "+c);
   }
}
public class Exception_6
{
   // throws clause in exception handling.

   public static void main(String[] args)
   {
       try
       {
          Div d=new Div();
          d.getDiv(12,0);
       }
       catch(Exception ex)
       {
         System.out.println("Error is : "+ex);
       }
   }
}