import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int r= sc.nextInt();
      int c= sc.nextInt();
      int n= sc.nextInt();
      if((n==1)||(n%r==0)||(n%r==1))
      System.out.println("Yes");
      else 
        System.out.println("No");
      
        
	}
}