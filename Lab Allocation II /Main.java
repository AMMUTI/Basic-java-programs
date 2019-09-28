import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int l1=Integer.parseInt(br.readLine());
      int l2=Integer.parseInt(br.readLine());
      int l3=Integer.parseInt(br.readLine());
      String l4=br.readLine();
      int min;
      if(l4.compareTo("L1")==0)
        l1=100;
      else  if(l4.compareTo("L2")==0)
        l2=100;
      else
        l3=100;
      if(l1<l2&&l1<l3)
        System.out.println("L1");
      else if(l2<l3&&l2<l1)
        System.out.println("L2");
      else 
        System.out.println("L3");
      
        
        
    }
}