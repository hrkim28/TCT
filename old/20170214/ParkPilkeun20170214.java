package com.test;

public class ParkPilkeun20170214 {

    public boolean test( String number ) {

        boolean rtnBool = true;

        if ( number.length() != 10 )
            return false;

        for ( int i=0; i<10; i++ ) {
            if ( number.indexOf( String.valueOf( i ) ) < 0 ) {
                rtnBool = false;
                break;
            }
        }

        return rtnBool;
    }

    public static void main( String[] args ) {
        String testNum = "0123458697";

        ParkPilkeun20170214 lcp = new ParkPilkeun20170214();
        System.out.println( testNum + " :: " +  lcp.test( testNum ));
    }
}
