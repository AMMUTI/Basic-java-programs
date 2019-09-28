#include <stdio.h>
int main() 
{
  int j,r, sum=0,i,a,n,fact=1;
  scanf("%d",&n);
  a=n;
  for(i=1;a!=0;i++)
  {
    r=a%10;
   // printf(" r %d\n",r);
     for(j=1;j<=r;j++)
     { 
        fact=fact*j;
       
     }
      // printf("fact %d\n",fact);
       sum= sum + fact;
       fact=1;
       a=a/10;
      
  }
 // printf("%d\n",sum);
   if(sum==n)
  {
    printf("Yes");
  }
  else
    printf("No");
}