import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=5,k=6;
        for(int i=1;i<=n;i++)
        {System.out.printf("%d ",k);
          k+=t;
         t+=5;
          
        }
	}
}