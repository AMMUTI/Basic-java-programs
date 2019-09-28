import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      while(n!=0)
      {
        int i=n%10;
        sum=sum+i;
        n=n/10;
      }
      System.out.println("Alice must go in path-"+sum);
	}
}