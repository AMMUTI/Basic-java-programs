import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int oddsum=0,evesum=0;
      int temp=n,t;
        while(n!=0)
        {
          t=n%10;
          n=n/10;
          if(t%2==0)
            evesum+=t;
          else
            oddsum+=t;
    }
      if(oddsum==evesum)
        System.out.println("yes");
      else
        System.out.println("No");
}}