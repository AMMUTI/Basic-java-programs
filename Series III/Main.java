import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int k=3;
      for(int i=1;i<=n;i++)
      {
        System.out.printf("%d ",k);
        k*=3;
      }
	}
}