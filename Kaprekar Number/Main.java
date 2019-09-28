import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      int t;
      int sum=0;
      int k=n;
      n=n*n;
      while(n!=0)
      { t=n%10;
        sum=sum+t;
          n=n/10;
      }
     if(k==sum) 
       System.out.println("Kaprekar Number");
      else
        System.out.println("Not A Kaprekar Number");
    }
}