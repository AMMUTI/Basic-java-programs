#include<stdio.h>
int main()
{
    int y,n1,n2,n3;
    scanf("%d %d %d",&n1,&n2,&n3) ;   
  y= gnum(n1,n2,n3);
  printf("%d",y);
}
int gnum(int x,int y,int z)
{
  if(x>y)
  {
    if(x>z)
      return x;
     else
       return z;
  }  
  else if(y>z)
     return y;
   else 
      return z;
}
