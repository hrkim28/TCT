#include <stdio.h>

void main()
{
    int  idx, count;
    char *sp, tempstr[100];

    count = 0;
    for ( idx = 1; idx < 10000 ; idx++ ) {
        sprintf ( tempstr, "%d", idx );

        sp=tempstr;
        while (*sp) {
            if( *sp++ == '7' ) {
               count++;
            }
        }
    }
    printf("count 7 : %d\n",count);
}
