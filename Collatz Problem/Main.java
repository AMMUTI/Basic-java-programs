import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(n);
       int c=0;
          while(n!=1)
          {
            if(n%2==0)
            { n=n/2;
             c++;
              System.out.println(n);}
            else
            {n=3*n+1;
              c++;
              System.out.println(n);}
          }
      System.out.println(c);
    }
  
}