#include <stdio.h>
#include <ctype.h>

#define  MAX_MEETING_COUNT 100

void main()
{
    int  idx1, idx2, idx3;
    char tempstr[MAX_MEETING_COUNT] = {'-',};

    idx1=0, idx2=0, idx3=0;
    while (1) {
        idx2++;
        while (tempstr[idx1]=='N') idx1++;
        if (idx1>=MAX_MEETING_COUNT) idx1=0;

        if ( (idx2 % 2) == 0 ) {
            tempstr[idx1]='N';
            idx3++;
        } else {
            tempstr[idx1]='Y';
        }

        printf ("idx1:%2d, idx2:%2d, idx3:%2d - %s \n",idx1,idx2,idx3,tempstr);

        if(idx3 >= MAX_MEETING_COUNT+1) break;
        idx1++;
    }
}
