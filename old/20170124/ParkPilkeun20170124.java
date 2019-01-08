package com.test;

public class ParkPilkeun20170124 {

    public void test( ) {
        int cnt = 0;
        int temp = 0;
        int mod = 0;

        for ( int i = 1; i <= 10000; i++ ) {
            temp = i;
            while ( true ) {
                mod = temp % 10;
                temp = temp / 10;

                if ( mod == 7 ) cnt++;

                if ( temp == 0 ) break;
            }
        }

        System.out.println( "Count 7 ::: " + cnt );

        int cnt2 = 0;
        for ( int i = 0; i <= 9; i++ ) {
            for ( int j = 0; j <= 9; j++ ) {
                for ( int k = 0; k <= 9; k++) {
                    for ( int l = 0; l <= 9; l++) {
                        if ( i == 7 ) cnt2++;
                        if ( j == 7 ) cnt2++;
                        if ( k == 7 ) cnt2++;
                        if ( l == 7 ) cnt2++;
                    }
                }
            }
        }

        System.out.println( "Count 7 v2 ::: " + cnt2 );
    }

    public static void main( String[] args ) {
        ParkPilkeun20170124 lcp = new ParkPilkeun20170124();
        lcp.test();
    }
}
