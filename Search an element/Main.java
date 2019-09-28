import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
       int a=sc.nextInt();
       for(int i=0;i<n;i++)
        {
          if(arr[i]==a)
          {System.out.println(a+" is present in the array");
           System.exit(0);}
        }
      System.out.println(a+" is not present in the array");
    }
}