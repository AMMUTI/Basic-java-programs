import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      int a=Integer.parseInt(br.readLine());
      char c=(char)(a+0);
      System.out.println(c);
    }
}