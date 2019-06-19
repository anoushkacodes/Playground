#include<stdio.h>
int main()
{
  int a,b,c,s;
  scanf("%d", &a);
  b=a%10;
  c= (a/100)%10;
  s=b+c;
  printf("%d",s);
  return 0;
}