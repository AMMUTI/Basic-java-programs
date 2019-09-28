#include<stdio.h>
int main()
{
   
    int i,j,n;
  
    scanf("%d",&n);
    
    
    for(i=0; i < n ;i++)
    {
        //4
        for(j=0; j < n ;j++)
        {
            //5
            if(i==j || j==(n-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        //6
        printf("\n");
    }
    return 0;
}