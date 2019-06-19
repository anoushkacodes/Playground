#include<stdio.h>
int main()
{
  int year;
  scanf("%d", &year);
  int ly= year%4;
  if(ly==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}