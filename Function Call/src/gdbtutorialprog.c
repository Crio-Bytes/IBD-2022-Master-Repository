#include<stdio.h>
int add(int n1, int n2)
{
    int sum = 0;
    sum = n1 +n2;
    return sum;
}
int main()
{
    int n1 = 1;
    int n2 = 2;
    int sum;
    sum = add(n1,n2);
    printf("\n The addition of  %d and %d is %d\n",n1,n2,sum);
    return 0;
}