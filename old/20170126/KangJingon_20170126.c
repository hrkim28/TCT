#include <stdio.h>
#include <ctype.h>

void main()
{
    int  idx1, idx2, n;
    char ch, *sp1, *sp2, *sp3, tempstr[1000], outstr[1000];

    n=20, sp1=tempstr;
    for ( idx1=0; idx1<n; idx1++) {
        sprintf (sp1, "a%d", idx1);
        while(*sp1) sp1++;
    }
    for ( idx1=0; idx1<n; idx1++) {
        sprintf (sp1, "b%d", idx1);
        while(*sp1) sp1++;
    }

    sp1=sp2=tempstr;
    ch=tempstr[0];
    while (*sp2==ch || isdigit(*sp2)) sp2++;

    sp3=outstr;
    while (*sp2) {
         do {
             *sp3++ = *sp1++;
         } while (isdigit(*sp1));

         do {
             *sp3++ = *sp2++;
         } while (isdigit(*sp2));
    }

    printf("%s", outstr);
}
