class demo
{
    public static void main(String args[])
    {
        String s=null;
        System.out.println("welcome 1");
        System.out.println("welcome 2");
        try{
              System.out.println(s.length());
            }
            catch(NullPointerException e)
            {
                System.out.println("Enter a Valid Information");
            }
            System.out.println("welcome 4");
            System.out.println("welcome 5");
    }
}