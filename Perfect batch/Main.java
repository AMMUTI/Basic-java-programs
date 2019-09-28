
#include<stdio.h>
void elem(int a[],int n);

int main()
{ int n;
 scanf("%d",&n);
 int a[n];
 for(int i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
 }
 elem(a,n);
  return 0;
}
void elem(int a[],int n)
{
  int b=0,b2=0;
  for(int i=0;i<n/2;i++)
  {
    b=b+a[i];
  }
  for(int i=n/2;i<n;i++)
  {
    b2=b2+a[i];
  }
  if(b==b2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
}