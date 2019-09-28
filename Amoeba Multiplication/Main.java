import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fib=1,a=1,b=1,t;
      if(n==0)
        System.out.println("0");
      else if(n==1)
        System.out.println("1");
      else
        for(int i=2;i<=n-2;i++)
        {
         t=b;
         b+=a;
         a=t;
         // System.out.println(b);
          
        }
      System.out.println(b);
    }
}