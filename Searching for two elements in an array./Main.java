#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
  int e1,e2,c1,c2;
  scanf("%d %d",&e1,&e2);
  for(int i=0;i<size;i++)
  {
    if(a[i]==e1)
      e1=i;
      c1=1;
    if(a[i]==e2)
    {
      e2=i;
      c2=1;
    }
  }
  //printf("%d",c2);
  if(c1==1)
  printf("%d\n",e1);
  else
    printf("-1\n");
  if(c2==1)
    printf("%d\n",e2);
  else
    printf("-1\n");
  
  return 0;
}