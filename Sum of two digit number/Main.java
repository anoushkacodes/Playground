#include<stdio.h>
int main()
{
  int no, sum=0;
  scanf("%d",&no);
  int a;
  a=no;
  while(a>0)
  {
    sum= sum+ (a%10);
    a=a/10;
  }
  printf("%d", sum);
  return 0;
}