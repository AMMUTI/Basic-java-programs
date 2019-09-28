#include<stdio.h>
#include<string.h>
int main()
{
  char a[10];
  scanf("%s",a);
 // printf("%s",a);
 char b[10];
   int len =strlen(a);
  
  
  int end = len-1;
 // printf("%d",end);
  int beg=0;
  for(int i=end;i>=0;i--)
  {
    b[beg]=a[i];
    
      beg++;
        
  }
 b[beg]='\0';
  int v=strcmp(a,b);
  if(v!=0)
  {printf("%s is not a palindrome",a);}
  else
   printf("%s is a palindrome",a) ;
}