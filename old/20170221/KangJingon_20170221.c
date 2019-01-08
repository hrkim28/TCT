     1  #include <stdio.h>
     2
     3  void main()
     4  {
     5      int  inp, idx, temp, count, t_or_f;
     6
     7      inp = 9;
     8      t_or_f = 0; /* 0: flase, 1: true */
     9
    10      for ( idx=1; idx <= inp; idx++) {
    11
    12          temp = inp;
    13          count = 0;
    14
    15          while ( temp > 0 ) {
    16              temp = temp - idx;
    17
    18              if ( count > idx ) {
    19                  t_or_f = 0;
    20                  break;
    21              }
    22              count++;
    23          }
    24
    25          if ( temp == 0 && count == idx ) {
    26              t_or_f = 1;
    27              break;
    28          }
    29      }
    30
    31      printf ( " %s \n", (t_or_f == 1) ? "true" : "false" );
    32  }