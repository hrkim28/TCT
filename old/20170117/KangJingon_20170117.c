#include <stdio.h>
#include <string.h>

void main()
{
   char i_str[100];
   char rep_ch;
   int  rep_ct, idx1, strsize;

   scanf("%s", i_str);
   strsize = strlen(i_str);

   for (idx1=0; idx1<strsize; idx1++) {

       rep_ct = 1;
       rep_ch = i_str[idx1];
       while (rep_ch==i_str[idx1+1]) {
           rep_ct++;
           idx1++;
       }
       rep_ct > 1 ? printf ("%c%d",rep_ch,rep_ct) : printf ("%c",rep_ch);
   }
}
