$ cat reverse.c
     1  #include <stdio.h>
     2
     3  int reverse (int tmpval)
     4  {
     5      int temp1=0, temp2=0;
     6
     7      temp2 = tmpval;
     8
     9      while (temp2 > 0) {
    10          temp1 = temp1*10 + temp2%10;
    11          temp2 = (temp2/10);
    12      }
    13
    14      return temp1;
    15  }
    16
    17  void main()
    18  {
    19
    20      int temp_array[] = { 101, 195, 265, 750 };
    21      int idx1, total, count;
    22
    23      for(idx1=0; idx1<4; idx1++) {
    24          total = temp_array[idx1];
    25          count =0;
    26          while ( total != reverse (total) ) {
    27              total += reverse (total);
    28              count++;
    29          }
    30          printf("%d %d\n", count, total);
    31      }
    32  }
$ ./a.out
0 101
4 9339
5 45254
3 6666
$
