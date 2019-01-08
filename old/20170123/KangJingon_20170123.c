#include <stdio.h>

#define True  1
#define False 0

int hashad ( int input_num )
{
    int subidx1 = 0;
    int temp = input_num;

    while ( temp >= 1 ) {
        subidx1 += temp%10;
        temp /= 10;
    }
    subidx1 += temp;

    if(input_num % subidx1==0) {
        return True;
    }
    else {
        return False;
    }
}

void main()
{
    int idx1;

    for (idx1=10;idx1<100;idx1++) {
         if(hashad(idx1) == True)
             printf("\n%10d", idx1);
    }
}