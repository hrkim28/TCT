     1  #include <stdio.h>
     2  #include <string.h>
     3  #include <stdlib.h>
     4
     5  #define MOD_NUMBER 6
     6
     7  void main()
     8  {
     9      int  idx1, idx2, strike, ball, temp, number[3] = { 0, }, input_num[3] = { 0, };
    10      char tempstr[100];
    11
    12      while ( 1 ) {
    13
    14          printf ("\n\n Input 3 number : %d ~ %d  \n", 0, MOD_NUMBER-1 );
    15          scanf ("%d %d %d", &input_num[0], &input_num[1], &input_num[2]);
    16
    17          number[0] = rand()%MOD_NUMBER;
    18          do { number[1]=rand()%MOD_NUMBER; } while (number[0]==number[1]);
    19          do { number[2]=rand()%MOD_NUMBER; } while (number[0]==number[2] || number[1]==number[2] );
    20
    21          for (strike=ball=0,idx1=0;idx1<3;idx1++) {
    22              if (number[idx1] == input_num[idx1])  strike++;
    23
    24              for (idx2=0;idx2<3;idx2++) {
    25                 if (idx1 != idx2 && number[idx1]==input_num[idx2])  ball++;
    26              }
    27          }
    28
    29          printf ("Com.: %d, %d, %d \nInput: %d, %d, %d  \n   \n",
    30                 number[0], number[1], number[2], input_num[0], input_num[1], input_num[2]);
    31          printf ("Strike : %d, Ball : %d \n", strike,ball);
    32      }
    33  }       
