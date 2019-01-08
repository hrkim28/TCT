package com.test;

public class ParkPilkeun20170118 {

    public void printMatrix( int rowCnt, int colCnt, int maxCnt ) {

        String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[] temp = new String[ rowCnt * colCnt ];
        int tmpIdx = 0;

        int overCnt = 0;
        int index = 0;

        if ( maxCnt < 27 ) {
            for ( int i = 0; i<rowCnt; i++ ) {
                for ( int j=0; j<colCnt; j++ ) {

                    if ( i * colCnt + j < maxCnt ) {
                        index = i * colCnt + j;

                    } else {
                        index--;

                        if ( index < 0 ) index = 0;
                    }

                    System.out.print( alpha[index] );

                    temp[tmpIdx] = alpha[index];
                    tmpIdx++;
                }
    
                System.out.println();
            }

            System.out.println( );

            index = 0;
            for ( int i = 0; i<rowCnt; i++ ) {
                for ( int j=0; j<colCnt; j++ ) {
                    index = j*rowCnt + i;

                    System.out.print( temp[index] );
                }
    
                System.out.println();
            }
        }
    }

    public static void main( String[] args ) {
        ParkPilkeun20170118 test = new ParkPilkeun20170118();
        test.printMatrix( 3, 4, 5 );
    }
}
