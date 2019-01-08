     1  #include <stdio.h>
     2  #include <stdlib.h>
     3
     4  int dice ()
     5  {
     6      int dice1, dice2;
     7
     8      dice1=rand()%6+1;
     9      dice2=rand()%6+1;
    10
    11      printf ( "%d, %d \n", dice1, dice2);
    12
    13      return (dice1 == dice2) ? dice1+dice2+dice() :  dice1+dice2;
    14  }
    15
    16  void main()
    17  {
    18      printf ("forward : %d \n", dice());
    19  }
