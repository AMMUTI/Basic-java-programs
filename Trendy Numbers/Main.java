import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner (System.in);
      int n= sc.nextInt();
      int i=0;
      int t=n;
      while(n!=0)
      {i++;
       n=n/10;
      }
      if(i==3)
      {
        t=t/10;
        t=t%10;
        if(t%3==0)
          System.out.println("Trendy Number");
        else
          System.out.println("Not a Trendy Number");
      }
      else
        System.out.println("Not a Trendy Number");
    }
}