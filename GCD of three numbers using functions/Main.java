#include<stdio.h>
int main()
{
    int y,n1,n2,s,n3;
    scanf("%d %d %d",&n1,&n2,&n3) ;   
  y= gnum(n1,n2,n3);
  s= gcd(y,n1,n2,n3);
  printf("%d",s);
}
int gnum(int x,int y,int z)
{
  if(x<y)
  {
    if(x<z)
      return x;
     else
       return z;
  }  
  else if(y<z)
     return y;
   else 
      return z;
}
int gcd (int min,int x,int y,int z)
{int i;
 while(min!=0)
 {
   if((x%min==0)&&(y%min==0)&&(z%min==0))
   { return min;
     break;}
    else 
     min--;
 }
}