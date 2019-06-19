#include <stdio.h>
int main() {
	int n;
  scanf("%d", &n);
  int duplicate_n= n;
  int sum=0;
  int n_last;
  while(n>0)
  {
    n_last=n%10;
    sum=sum+n_last;
    n=n/10;
  }
  printf("%d", sum);
	return 0;
}