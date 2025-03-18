class demo
{
    public static void main(String args[])
    {
        String sc=("welcome to java ");
        System.out.println("welcome 1");
        System.out.println("welcome 2");
        try
        {
          System.out.println(sc.length());
           System.out.println(10/2);
        }
        catch(NullPointerException e)
        {
            System.out.println("Enter a valid number");
        }
        System.out.println("welcome 4");
    }
}