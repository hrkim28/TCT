     1  #include <stdio.h>
     2
     3  #define CARD_NUM 20
     4
     5  void output (int *list)
     6  {
     7      int idx;
     8
     9      for (idx=0;idx<CARD_NUM;idx++) {
    10          printf ("%d ",list[idx]);
    11      }
    12      printf ("\n");
    13  }
    14
    15  void reverse (int *list, int from_v, int to_v )
    16  {
    17      int idx, endi, tmp;
    18
    19      from_v-=1, to_v-=1;
    20      endi=to_v;
    21
    22      for (idx=from_v;idx<=to_v;idx++,endi--) {
    23          tmp=list[idx];
    24          list[idx]=list[endi];
    25          list[endi]=tmp;
    26          if(idx>=endi) break;
    27      }
    28  }
    29
    30  void main()
    31  {
    32      int list[CARD_NUM] = { 0, };
    33      int idx1, idx2;
    34
    35      for (idx1=0;idx1<CARD_NUM;idx1++) {
    36          list[idx1] = idx1+1;
    37      }
    38      output(list);
    39
    40      reverse ( list, 3, 7 );  output(list);
    41      reverse ( list, 4, 6 );  output(list);
    42      reverse ( list, 5, 5 );  output(list);
    43
    44  }

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
1 2 7 6 5 4 3 8 9 10 11 12 13 14 15 16 17 18 19 20
1 2 7 4 5 6 3 8 9 10 11 12 13 14 15 16 17 18 19 20
1 2 7 4 5 6 3 8 9 10 11 12 13 14 15 16 17 18 19 20
