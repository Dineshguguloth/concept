class demo
{
    void x()
    {
      z();
    }
    void y()
    {
      x();
    }
    void z()
    {
      throw new ArithmeticException("Enter a valid number");
    }
    public static void main(String args[])
    {
         demo obj=new demo();
          System.out.println("welcome 1");
           try{
          obj.y();
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
        System.out.println("welcome 2");
    }
}