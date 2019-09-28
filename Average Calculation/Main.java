import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
 
    public static void main(String args[])throws IOException
    {float[] a=new float[5];
      float total=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         for(int i=0;i<5;i++)
         {
             a[i]=Float.parseFloat(br.readLine());
             total=total+a[i];
         } 
           total=total/5;
System.out.printf("%.2f",+total);
    }
}