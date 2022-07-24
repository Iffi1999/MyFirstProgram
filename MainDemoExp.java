class MainDemoExp
{
   public static void main (String arg[])
    {
       int  a = 10;
       try
            {
                int c = a / arg.length;
                System.out.println("c="+c);
                arg[5]="Ali";
            }catch(ArithmeticException e)
               {
                  System.out.println("Can not divide by zero");
               }catch(ArrayIndexOutOfBoundsException e)
                   {
                       System.out.println("Invalid Index");
                   }
                   System.out.println("After Catch");
    }
}