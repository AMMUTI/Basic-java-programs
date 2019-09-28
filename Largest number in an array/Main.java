int main()
{
  int size;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<=size-1;i++)
  {
    scanf("%d",&a[i]);
    //printf("%d\t",a[i]);
  }
  int c,t=9;
  for(int i=0;i<=size;i++)
  {
    if(a[i]>a[i+1])
    {
      t=a[i];
      a[i]=a[i+1];
      a[i+1]=t;
    } 
  }
  if(size==5)
  printf("%d",a[size]);
  else
  printf("%d",a[size-1]);
  
}