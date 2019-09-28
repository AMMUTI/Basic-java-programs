import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    float x1=sc.nextFloat();
    float y1=sc.nextFloat();
    float x2=sc.nextFloat();
    float y2=sc.nextFloat();
    float x=(x1+x2)/2;
    float y=(y1+y2)/2;
    System.out.println("Binoy's house is located at ("+x+","+y+")");
  }
}