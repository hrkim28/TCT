package com.test;

public class ParkPilkeun20170119 {

    public static void main( String[] args ) {

        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;

        String tempStr = "";

        for ( int i = 100; i < 1000; i++ ) {
            tempStr = String.valueOf( i );

            a = Integer.parseInt( tempStr.substring( 0, 1 ) );
            b = Integer.parseInt( tempStr.substring( 1, 2 ) );
            c = Integer.parseInt( tempStr.substring( 2 ) );

            sum = a*a*a + b*b*b + c*c*c;

            if ( i == sum ) {
                System.out.println( i );
            }
        }
    }
}