import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int l1=sc.nextInt();
      int l2=sc.nextInt();
      int l3=sc.nextInt();
      int n=sc.nextInt();
      int c=0;
      if(l1>n)
        c++;
      if(l2>n)
        c++;
      if(l3>n)
        c++;
      System.out.println(c);
    }
}