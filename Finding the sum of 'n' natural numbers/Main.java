#include <stdio.h>
int fact(int n);
int main()
{int n;
 scanf("%d",&n);
 int f=fact(n);
 printf("%d",f);
return 0;
}
int fact(int n)
{if(n==1)
  return;
  else
  return n+fact(n-1) ;
   
}