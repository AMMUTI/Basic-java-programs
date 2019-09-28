#include<stdio.h>
int square(int a)
{
  int s=a*a;
  return s;
}
int main() 
{
   int n;
   scanf("%d",&n);
   int s =square (n);
  printf("%d",s);
   //return 0;
}