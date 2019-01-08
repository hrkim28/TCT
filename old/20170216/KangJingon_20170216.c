 
     1  #include <stdio.h>
     2
     3  void main()
     4  {
     5      int  inp, idx, startp, endp;
     6
     7      inp = 100;
     8
     9      startp = 1, idx = 1, endp = 1;
    10      while ( 1 ) {
    11          printf(" inp: %d, idx: %d, startp: %d, endp: %d \n",inp, idx,startp,endp);
    12          startp = startp * 2;
    13          endp += startp;
    14          idx++;
    15
    16          if ( endp >= inp ) {
    17              break;
    18          }
    19      }
    20
    21      printf ( " %d \n", idx );
    22  }
 
 inp: 100, idx: 1, startp: 1, endp: 1
 inp: 100, idx: 2, startp: 2, endp: 3
 inp: 100, idx: 3, startp: 4, endp: 7
 inp: 100, idx: 4, startp: 8, endp: 15
 inp: 100, idx: 5, startp: 16, endp: 31
 inp: 100, idx: 6, startp: 32, endp: 63
 7
