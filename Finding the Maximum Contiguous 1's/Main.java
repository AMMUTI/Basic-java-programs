#include<stdio.h>
int main()
{
  int n,count=0;
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
    if(a[i]==1&&a[i+1]!=0)
      count++;
  }
  printf("%d",count);
}