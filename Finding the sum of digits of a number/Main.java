#include <stdio.h>
int main() 
{
  int a,sum=0,r;
  scanf("%d",&a);
  {
  while(a!=0)
  {
    r= a % 10;
    sum= sum + r;
   // printf("%d",sum);
    a=a/10;
    
  }
  printf("%d",sum);
  }
	return 0;
}