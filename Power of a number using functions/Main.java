#include<stdio.h>
int main()
{
    int b,e;
  scanf("%d %d",&b,&e);
  int y,a,c;
  y=power(b,e);
  printf("%d",y);
  
}
int power(int a, int c)
{int p=1;
  for(int i=1;i<=c;i++)
  {
    p=p*a;
  }
   return p; 
}