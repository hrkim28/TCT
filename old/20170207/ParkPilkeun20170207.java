package com.test;

public class ParkPilkeun20170207 {

    int cnt = 0;

    public int reverse( int org ) {

        int powCnt = 0;
        int reverseNo = 0;
        int temp = 0;

        for ( int i = 9; i < org; i = i * 10 + 9) {
            if ( org > i ) {
                powCnt++;
            }
        }

        for ( int i = 0; true; i++ ) {
            temp = ( org / (int)Math.pow( 10, i ) );

            reverseNo = reverseNo + ( temp % 10) * (int)Math.pow( 10, powCnt );
            powCnt--;

            if ( powCnt < 0 )
                break;
        }

        return reverseNo;
    }

    public void test ( int orgNo ) {

        int reverseNo = reverse( orgNo );

        if ( orgNo == reverseNo ) {
            System.out.println( cnt + " \t " + orgNo );

        } else {
            cnt++;

            if ( cnt < 100 ) {
                test(  orgNo + reverseNo );
            } else {
                System.out.println( "error" );
            }
        }
    }

    public void quest( int[] numbers ) {
        for ( int i = 0; i < numbers.length; i++ ) {
            cnt = 0;
            test( numbers[i] );
        }
    }

    public static void main( String[] args ) {
        int[] numbers = {101, 195, 265, 750 };

        ParkPilkeun20170207 lcp = new ParkPilkeun20170207();
        lcp.quest( numbers );
    }
}
