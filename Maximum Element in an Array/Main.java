import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int a[]=new int[n];
        int t;
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++) 
        {
          if(a[i]>a[j])
          {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
          }
        }
       }
      System.out.println(a[n-1]+" is the maximum element in the array");
    }
}