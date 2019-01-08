#include <stdio.h>

void main()
{
   int idx1,digit1, digit2, digit3, sum;

   for (idx1=100; idx1<1000; idx1++) {
       digit1 = idx1/100;
       digit2 = (idx1/10)-(digit1*10);
       digit3 = idx1/10; digit3=idx1-(digit3*10);

       sum = digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3;

       if( idx1 == sum ) {
           printf("%d \n", idx1);
       }
   }
}
