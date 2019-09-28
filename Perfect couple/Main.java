#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{int temp,c=0;
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
      temp=arr[i]+arr[j];
    
      if (sum==temp)
      { printf("Perfect couple: %d %d\n",arr[i],arr[j]);
        c=1;
       // printf("%d\n",c);
     }
    }
  }//printf("%d\n",c);
      if(c==0)
        printf("No perfect couple found!");
}