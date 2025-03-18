class demo
{
    public static void main(String args[])
    {
        String sc=null;
        System.out.println("java 1");
        System.out.println("java 2");
        try
        {
             System.out.println(sc.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("java 3");
        }
        catch(NullPointerException e)
        {
             System.out.println("enter a valid number");
        }
         System.out.println("java 4");
    }
}