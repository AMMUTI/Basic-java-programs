import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int i=0,a,p=0,b=0;
      for(i=0;i<n;i++)
      {
        a=sc.nextInt();
        if(a>0)
         p++;
       
        else
        b++;
       
        
      }
      System.out.println("Number of positive numbers is "+p+" and the number of negative numbers is "+b);
   //System.out.println("n "+n);}
    }
}