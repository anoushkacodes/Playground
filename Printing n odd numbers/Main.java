#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int c=1;
  for(int i=1;c<=n;c++)
  {
    printf("%d\n",i);
    i=i+2;
  }
	return 0;
}