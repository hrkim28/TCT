     1  #include <stdio.h>
     2
     3  void main()
     4  {
     5      int  inp[10][2] = { 1,0, 1,1, 1,2, 1,-1, 2,1,  2,3, -1,1,  -2,1,  -1,3,  -1,-1 };
     6      int  tag[100][100] = { 0, };
     7
     8      int  idx1, idx2, xp, xm, yp, ym, flag;
     9
    10      for ( idx1 = 0; idx1 < 10; idx1++ ) {
    11          for ( idx2 = 0; idx2 < 2; idx2++ ) {
    12              tag[ inp[idx1][0]+50 ][ inp[idx1][1]+50 ] = 1;
    13          }
    14      }
    15
    16      for ( idx1 = 0; idx1 < 100; idx1++ ) {
    17          xp = -100, xm = 100, flag=0;
    18          for ( idx2 = 0; idx2 < 100; idx2++ ) {
    19              if ( tag[idx2][idx1] == 1 ) {
    20                  xp = ( xp < idx2 )  ? idx2 : xp;
    21                  xm = ( xm > idx2 )  ? idx2 : xm;
    22                  flag++;
    23              }
    24          }
    25          if (flag) tag[xp][idx1] = tag[xm][idx1] = 2;
    26      }
    27
    28      for ( idx1 = 0; idx1 < 100; idx1++ ) {
    29          yp = -100, ym = 100, flag=0;
    30          for ( idx2 = 0; idx2 < 100; idx2++ ) {
    31              if ( tag[idx1][idx2] == 2 ) {
    32                  yp = ( yp < idx2 )  ? idx2 : yp;
    33                  ym = ( ym > idx2 )  ? idx2 : ym;
    34                  flag++;
    35              }
    36          }
    37          if(flag) tag[idx1][yp] = tag[idx1][ym] = 3;
    38      }
    39
    40      for ( idx1 = 0; idx1 < 100; idx1++ ) {
    41          for ( idx2 = 0; idx2 < 100; idx2++ ) {
    42              if ( tag[idx1][idx2] == 3 ) {
    43                  printf ( "(%d,%d) ", idx1-50, idx2-50 );
    44              }
    45          }
    46      }
    47
    48  }
    49
    50  /*
    51  ¿¹) input : (1,0), (1,1), (1,2), (1,-1), (2,1), (2,3), (-1,1), (-2,1),(-1,3),(-1,-1)
    52      output : (2,1), (2,3), (-1,3), (-2,1), (-1,-1), (1,-1)
    53
    54  (-2,1) (-1,-1) (-1,3) (1,-1) (1,2) (2,1) (2,3) :  (1,2) <- ???????
    55
    56  */