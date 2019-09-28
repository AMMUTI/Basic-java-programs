import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      float k= 0.5f;
      for(int i=0;i<n;i++)
      {
        System.out.printf("%.1f ",+k);
        k*=(float)3;
      }
	}
}