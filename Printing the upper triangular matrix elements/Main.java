#include <stdio.h>
int main()
{
int r,c;
scanf("%d",&r);
scanf("%d",&c);
int mat[r][c];
int i, j;
for(i = 0; i < r; i++)
{
  for(j = 0; j < c; j++)
       scanf("%d",&mat[i][j]);
}
for (int k = 0; k < c; k++)
{
  for (i=0,j=k;j<c;i++,j++)
  {       
           printf("%d ",mat[i][j]);
  }
}

}