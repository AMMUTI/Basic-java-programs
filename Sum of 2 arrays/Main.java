import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int a[]=new int[n];
        int b[]=new int[n];
        int t;
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
         b[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
         System.out.println(a[i]+b[i]);
       }
       }
       }
    
