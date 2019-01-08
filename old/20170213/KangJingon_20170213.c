     1  #include <stdio.h>
     2
     3  #define MAX_NUM 5000
     4
     5  void main()
     6  {
     7      int  idx1, idx2, sum, num_array[MAX_NUM]={0,};
     8      char str[100];
     9
    10      for (idx1=1;idx1<MAX_NUM;idx1++) {
    11
    12          sum = idx1;
    13
    14          idx2 = 0;
    15          sprintf (str, "%d", idx1);
    16          do {
    17              sum = sum +  (int)(str[idx2]-'0');
    18          } while (str[++idx2]);
    19
    20          if ( sum < MAX_NUM ) {
    21              num_array[sum]++;
    22          }
    23      }
    24
    25      for (sum=0, idx1=1;idx1<MAX_NUM;idx1++) {
    26          if ( num_array[idx1] == 0 ) {
    27              sum = sum + idx1;
    28          }
    29      }
    30
    31      printf ( " SUM : %d \n", sum );
    32  }
 
 SUM : 1227365