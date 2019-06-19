#include<stdio.h>
int main()
{
  int a= 365;
  int q;
  int rem=a%4;
  q= a/4;
  printf("Quotient: %d\n", q);
         printf("Remainder: %d\n", rem);
  return 0;
}