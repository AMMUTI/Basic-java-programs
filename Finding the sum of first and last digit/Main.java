#include <stdio.h>
int main() {
	int i,n,a,b,sum;
  scanf("%d",&n);
  a= n%10;
 // 
  while(n> 10)
  {
    
    n=n/10;
    i=n;
  }
   // b=i/10;
  
  sum = a+i;
  printf("%d",sum);
	return 0;
}