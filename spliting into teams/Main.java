import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=a/b;
 System.out.println("The number of students in each team is "+(a/b)+" and left out is "+(a%b));
}
}