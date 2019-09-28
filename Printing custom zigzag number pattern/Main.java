#include <stdio.h>

int main()
{
   int n,c;
   scanf("%d",&n);
   c=n-1;
   for(int i=1;i<=n;i++)
   {
       if(i%2==0)
      
       printf("%d",c=i+1);
       for(int j=1;j<n;j++)
       {
           printf("%d",i);
       }
       if(i%2!=0)
        printf("%d",c=i+1);
        printf("\n");
   }
  
  
   return 0;
}