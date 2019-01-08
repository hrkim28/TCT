     1  #include <stdio.h>
     2
     3  void main()
     4  {
     5      int   idx, sum, num[10] = {0, };
     6      char  str[1000], *sp;
     7
     8      scanf ( "%s", str );
     9
    10      sp = str;
    11
    12      while ( *sp ) {
    13          num[ (*sp - '0') ]++;
    14          sp++;
    15      }
    16
    17      for (sum=idx=0;idx<10;idx++) {
    18          sum+=num[idx];
    19      }
    20
    21      if (sum == 10) {
    22          printf ("True \n");
    23      } else {
    24          printf ("False \n");
    25      }
    26  }