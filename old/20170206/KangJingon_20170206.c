     1  #include <stdio.h>
     2  #include <string.h>
     3  #include <stdlib.h>
     4
     5  #define MOD_NUMBER 45
     6
     7  void main()
     8  {
     9      int  idx1, idx2, temp, num_array[6] = { 0, };
    10
    11      for (idx1=0;idx1<6;idx1++) {
    12
    13          num_array[idx1]=rand()%MOD_NUMBER + 1;
    14          for (idx2=0;idx2<idx1;idx2++) {
    15              printf("(%d-%d)", num_array[idx2],num_array[idx1]);
    16              if (num_array[idx1] == num_array[idx2]) {
    17                  num_array[idx1]=rand()%MOD_NUMBER + 1;
    18                  printf ("regen ");
    19                  idx2=-1;
    20              }
    21          }
    22          printf ("%d \n ",num_array[idx1]);
    23      }
    24      printf ("\n");
    25
    26      for (idx1=0;idx1<6;idx1++) {
    27          for (idx2=idx1+1;idx2<6;idx2++) {
    28              if (num_array[idx1] > num_array[idx2]) {
    29                  temp = num_array[idx2];
    30                  num_array[idx2] = num_array[idx1];
    31                  num_array[idx1] = temp;
    32              }
    33          }
    34          printf ("%d ",num_array[idx1]);
    35      }
    36      printf ("\n");
    37  }
$ ./gen_sort
29
 (29-17)17
 (29-28)(17-28)28
 (29-26)(17-26)(28-26)26
 (29-24)(17-24)(28-24)(26-24)24
 (29-26)(17-26)(28-26)(26-26)regen (29-2)(17-2)(28-2)(26-2)(24-2)2

2 17 24 26 28 29