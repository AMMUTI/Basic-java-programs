import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      int b=sc.nextInt();
      int c=sc.nextInt();
      int age;
      if(b>c)
      {age=100-b;
         age+=c; }
      else
        age=c-b;
      System.out.println(age);
    }
}