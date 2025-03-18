import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        int n1,n2,cal;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
       n1=sc.nextInt();
       n2=sc.nextInt();
       System.out.println("Select any option");
       cal=sc.nextInt();
       if(cal==1)
       {
        cal=n1+n2;
         System.out.println("The addition of two numbers:"+cal);
       }
       else if(cal==2)
       {
        cal=n1-n2;
        System.out.println("The subtraction:"+cal);
       }
        else if(cal==3)
       {
        cal=n1*n2;
        System.out.println("The Multipication:"+cal);
       }
        else
       {
        cal=n1/n2;
        System.out.println("The division:"+cal);
       }

    }
}