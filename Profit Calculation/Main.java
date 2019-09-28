import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=(x*b)-(x*c);
      System.out.println("The profit obtained is Rs."+(d-100));
	}
}