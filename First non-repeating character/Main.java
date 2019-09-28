#include<stdio.h>
#include<string.h>
int main()
{
	char ch,str[100];
  int found=0;
  scanf("%[^\n]s",str);
  int len= strlen(str);
  for(int i=0;i<len;i++)
  {found=0;
    for(int j=0;j<len;j++)
    {
      if(str[i]==str[j]&&i!=j)
      {
        found=1;
          break;
      }
    }
   if(found==0)
   {
      ch=str[i];
      break;
   }
  }
  if(found==0)
  {
    printf("%c",ch);
  }
  else
    printf("All the characters are repetitive");
	return 0;
}