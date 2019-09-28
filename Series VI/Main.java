import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      System.out.printf("%d ",+0);
      for(int i=2;i<=n;i++)
      {
        if(i%2==0)
          System.out.printf("%d ",(i*i-2));
        else
          System.out.printf("%d ",(i*i-1));
      }
	}
}