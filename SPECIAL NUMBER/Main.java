import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         
      int sum=0,pro=1;
      int temp,t,ans;
      for(int i=a;i<=b;i++)
      {temp=i;
        while(temp!=0)
         {
          t=temp%10;
          sum+=t;
          pro=pro*t;
          temp=temp/10;
         }
       
      ans=sum+pro;
      if(ans==i)
       System.out.println(i);
       sum=0;
       pro=1;
      }
      }
}