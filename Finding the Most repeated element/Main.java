#include<stdio.h>
int main()
 {
  int n,count=0,num,count1=0;
   scanf("%d",&n);
  // printf("%d",n);
  int a[n]; 
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    //printf("%d ",a[i]);
  }
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       if(a[i]==a[j]&&i!=j)
       {
         count++;
       }
     }
     if(count1<count)
     {
       num=a[i];
       count1=count;
     }
   }
  if(num!=0)
   printf("%d",num);
  else
    printf("%d",a[0]);
}