#include <stdio.h>
#include <string.h>

void main()
{
    char input_str[20][20] = { "apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"  };
/*
    char input_str[20][20] = { "test", "war", "holiday", "window", "project" };
*/
    char temp[20];
    int  idx1, idx2, count;


    count = 0;
    for ( idx1 = 0; input_str[idx1][0]; idx1++ ) {
        count++;
        for ( idx2 = idx1+1; input_str[idx2][0]; idx2++ ) {
            if ( strcmp (input_str[idx1], input_str[idx2] ) > 0 ) {
                strcpy (temp, input_str[idx1]           );
                strcpy (input_str[idx1], input_str[idx2]);
                strcpy (input_str[idx2], temp           );
            }
        }
    }

    count = (count%2==0) ? count/2-1 : count/2;
    printf ("median :  %s  \n", input_str[count] );
}
