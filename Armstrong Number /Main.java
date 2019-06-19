#include <stdio.h>
#include<math.h>
int main() {
	int n;
  scanf("%d",&n);
  int c=0, rem;
  int k=n;
  int m=n;
  int sum=0;
  while(k!=0)
  {
    k=k/10;
    c++;
  }
 
  while( m>0)
  {
    rem = m %10;
    sum=sum+pow(rem, c);
    m=m/10;
  }
 
  if(sum == n)
    printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
  
	return 0;
}