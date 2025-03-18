class demo
{
    int PIN=2003;
    public void checkpin()
    {
        System.out.println("Enter your PIN:");
        Scanner SC=new Scanner(System.in);
        int pin=sc.nextInt();
        if(pin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Wroung Password");
        }
    }
    public void menu()
    {
       System.out.println("Balance");
       System.out.println("Deposit");
       System.out.println("Withdraw");
       System.out.println("Exit");
       Scanner sc=new Scanner(System.in);
       int opt=sc.nextInt();
       if(opt==1)
       {
        balance();
        System.out.println("balance :"+Balance);
       }
       else if(opt==2)
       {
        deposit();
         System.out.println("deposit:"+Deposit);
       }
       else if(opt==3)
       {
         withdraw();
         System.out.println("Withdraw:"+Withdraw);
       }
       else
       {
         Exit();
         System.out.println("exit:+"Exit);
       }
    }
    




    public static void main(String args[])
    {

    }
}