import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
      float mark=0.0f;
      int count=0;
      int a;
      do
      { a=sc.nextInt();
        if(a<0)
         mark=(float)(mark-1.0);
        else if(a%2!=0)
        {mark++;
         count++;}
        else 
        {mark=(float)(mark-0.5);
        //count++;}
        }}
      while(count!=3&&a>0);
      
       
      System.out.println(mark);
}
}