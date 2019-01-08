     1  #include <stdio.h>
     2  #include <stdlib.h>
     3  #include <math.h>
     4
     5  void main()
     6  {
     7      int list1[] = { 4, 10, 15, 24, 26 };
     8      int list2[] = { 0,  9, 12, 20     };
     9      int list3[] = { 5, 18, 22, 30     };
    10      int i,j,k,a,b,c,max_v,min_v,len;
    11      int r1=0;
    12      int r2=0;
    13      int r3 =0;
    14      int minlen =1000;
    15
    16      for(int i=0; i<5;i++){
    17         for(int j=0; j<4;j++){
    18             for(int k=0; k<4;k++){
    19                 a = list1[i];
    20                 b = list2[j];
    21                 c = list3[k];
    22
    23                 max_v = ( a     > b ) ? a     : b;
    24                 max_v = ( max_v > c ) ? max_v : c;
    25
    26                 min_v = ( a     < b ) ? a     : b;
    27                 min_v = ( min_v < c ) ? min_v : c;
    28
    29                 len = max_v - min_v;
    30
    31                 if (len < minlen ) {
    32                     minlen = len;
    33                     r1 = i;
    34                     r2 = j;
    35                     r3 = k;
    36                 }
    37
    38              }
    39          }
    40      }
    41      max_v = (list1[r1] > list2[r2]) ? list1[r1] : list2[r2];
    42      max_v = (max_v     > list3[r3]) ? max_v     : list3[r3];
    43
    44      min_v = (list1[r1] < list2[r2]) ? list1[r1] : list2[r2];
    45      min_v = (max_v     < list3[r3]) ? min_v     : list3[r3];
    46
    47      printf("min: %d - max: %d \n", min_v, max_v);
    48  }