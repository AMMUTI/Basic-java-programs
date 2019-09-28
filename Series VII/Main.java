import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      System.out.printf("%d %.1f ",1,2.0);
      int j=1;
       for(int i=1;i<=(n-2)/2;i++)
        {
          
         float k=(float)j*(float)3;
          System.out.printf("%.1f ",k);
          float s=(float)j*(float)6;
          System.out.printf("%.1f ",s);
          j=j*3;
        }
         
        
        
      
	}
}