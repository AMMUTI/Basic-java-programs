#include <stdio.h>
int main() 
{
	int i, b,n,sum=0,a;
  scanf("%d",&n);
  b=n;
  for(i=1;b!=0;i++)
  { 
    a=b%10;
    a=a*a*a;
    sum=sum+a;
    //printf("%d\n",a);
    b=b/10;
   }
  if (n==sum)
  {
     printf("Armstrong Number") ;
  }
  else 
    printf("Not an Armstrong Number") ;
}