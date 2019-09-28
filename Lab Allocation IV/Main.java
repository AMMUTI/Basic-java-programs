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
      int c=100;
      if(l1>n)
        c=l1;
      if(l2>n)
        if(c>l2)
          c=l2;
      if(l3>n)
        if(c>l3)
          c=l3;
   if(c==l1)
     System.out.println("L1");
      else if (c==l2)
        System.out.println("L2");
      else
        System.out.println("L3");
    }
}