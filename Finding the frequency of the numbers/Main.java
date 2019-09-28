#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int a[n],temp[n],k;
  scanf("%d",&k);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  
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
 
  for(int i=0;i<k;i++)
  {
   temp[i]=i+1; 
  }
 /* for(int i=0;i<k;i++)
 {
 printf("%d",temp[i]);  
 }*/
   for(int i=0;i<k;i++)
   {
     int count=0;
      for(int j=0;j<n;j++)
      {
        if(temp[i]==a[j])
          count++;
      }
     printf("%d %d\n",temp[i],count);
   }
}