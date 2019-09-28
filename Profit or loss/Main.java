import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      b=b*12;
      if(b==a)
         System.out.println("No profit nor loss");
       else if(b>a)
         {b=b-a;
              System.out.printf("Profit : Rs.%.2f",+b);}
         else
         {a=a-b;
            System.out.printf("Loss : Rs.%.2f",+a);
      }
}}