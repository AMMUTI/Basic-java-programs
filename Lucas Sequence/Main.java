import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=0,c=1,t,y=0;
     
        System.out.printf("0 0 1");
  
      
      for(int i=3;i<n;i++)
        {
         y=a+b+c;
          a=b;
          b=c;
          c=y;
         System.out.printf(" "+y);
        }
      
      
    }
}