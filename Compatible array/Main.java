import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int a[]=new int[n];
        int b[]=new int[n];
        int k=0;
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
          if(a[i]>=b[i])
            k=0;
          else
            k=1;
        }
    if(k==0)
    System.out.println("Compatible");
    else
      System.out.println("Incompatible");
  }
}