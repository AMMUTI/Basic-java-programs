import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
        int a, sum=0,c=0;
        while(sum<n)
        {
            a= sc.nextInt();
            sum+=a;
            c++;
          if(n==sum)
            break;
          
        }
      System.out.println("The number of turns is "+c);
    }
}