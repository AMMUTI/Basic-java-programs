import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    //  int a='z';
     // System.out.println(a);
      Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
       if(c=='a'||c=='e'||c=='o'||c=='u')
         System.out.println("Vowel");
     else if((int)c>=97&&(int)c<=122)
       System.out.println("Consonant");
      else
        System.out.println("Not an alphabet");
    }
}