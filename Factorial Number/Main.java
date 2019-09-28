import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int fact=1,flag=0;
       for(int i=1;i<n/2;i++)
       {
         if(n==fact)
         {flag=1;
           System.out.println("Yes");
           break;
         }
         fact=fact*i;
       }
     if(flag==0)
           System.out.println("No");
    }
}