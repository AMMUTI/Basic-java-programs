#include<stdio.h>
int main()
{
  int a,f,s,sum;
  scanf("%d",&a);
  f = a/100;
  s=a%10;
   sum= f+s;
  printf("%d",sum);
  return 0;
}