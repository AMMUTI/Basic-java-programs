#include<stdio.h>
int main()
{
int n,idx=0;
  scanf("%d",&n);
  int a[n],temp[n],k;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  int t;
  for(int i=0;i<n;i++)
  {for(int j=0;j<n;j++)
  {
    if(a[i]<a[j])
    {
     t=a[j];
     a[j]=a[i];
     a[i]=t;}
  }}
   //for(int j=0;j<n;j++)
  // {
     printf("%d  ",a[n-k]);
  // }
    
  
}