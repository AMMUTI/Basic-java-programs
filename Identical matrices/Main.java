#include <stdio.h>
int main()
{
int r,c;
scanf("%d",&r);
scanf("%d",&c);
int a[r][c],b[r][c];
int i, j,flag=1;
for(i = 0; i < r; i++)
{
  for(j = 0; j < c; j++)
       scanf("%d",&a[i][j]);
}
for (int i = 0; i <r; i++)
{
  for (j=0;j<c;j++)
  {       
     scanf("%d",&b[i][j]);      
  }
  
}
  for (int i = 0; i <r; i++)
{
  for (j=0;j<c;j++)
  {  if(a[i][j]!=b[i][j])
     {
       flag=0;
       break;
     }
  }
  }
  if(flag==1)
    printf("Yes");
    else
      printf("No");
}