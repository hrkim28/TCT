package com.test;

public class ParkPilkeun20170123 {

    public boolean test( int x ) {
        
        int sum = 0;
        int temp = 0;

        int pre = 0;
        int cnt = 0;

        if ( x > 0 ) {
            for ( int i = 9; i < x; i = i * 10 + 9) {
                if ( x > i ) {
                    cnt++;
                }
            }

            for ( int i = cnt; i >= 0 ; i--) {

                if ( i == cnt ) {
                    temp = x / (int)Math.pow( 10, i );

                    sum = sum + temp;

                    pre = temp * (int)Math.pow( 10, i );
                } else {
                    temp = ( x - pre ) / (int)Math.pow( 10, i ); 

                    sum = sum + temp;

                    pre = x / (int)Math.pow( 10, i ) * (int)Math.pow( 10, i ); 
                }
            }

            if ( x % sum == 0 ) {
                System.out.println( x );
                return true;
            }
        }

        return false;
    }

    public static void main( String[] args ) {

        ParkPilkeun20170123 lcp = new ParkPilkeun20170123();
        System.out.println(  lcp.test( 13 ) );
    }
}
