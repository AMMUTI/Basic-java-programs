#include <stdio.h>
int main() {
	//Type your code
  int i,n,c=1;
  scanf("%d",&n);
  for(i=1;c<=n;i++)
  {
    if(i%2!=0)
    {
      printf("%d\n",i);
      c=c+1;
    }
    
    
  }
	return 0;
}