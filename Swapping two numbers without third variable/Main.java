import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a=Integer.parseInt(br.readLine());
     int b=Integer.parseInt(br.readLine());   
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println(a);
      System.out.println(b);
     // fill your code
    }
}