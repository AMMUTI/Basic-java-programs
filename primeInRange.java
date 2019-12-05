import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("**_Prime_**");
		System.out.println("Enter the range : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int flag=1;
		for(int i=a;i<=b;i++)
		{
		    for(int j=2;j<=i;j++)
		    {
		        if(i%j==0&&i!=j)
		        {
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1)
		     {
		         System.out.print(i+" ");
		     }
		    flag=1;
		}
		
	}
}
