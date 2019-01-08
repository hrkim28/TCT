package com.test;

import java.util.ArrayList;

public class ParkPilkeun20170131 {

    public ArrayList<Integer> meeting( ArrayList<Integer> girls, boolean lastAns ) {

        if ( girls.size() == 1 )
            return girls;
        else {
            ArrayList<Integer> restGirls = new ArrayList<Integer>();

            for ( int i = 0; i < girls.size(); i++ ) {
                if ( lastAns == true )
                    lastAns = false;
                else
                    lastAns = true;

                if ( lastAns ) {
                    restGirls.add( girls.get( i ) );
                }
            }

            girls = meeting( restGirls, lastAns );
        }

        return girls;
    }

    public static void main( String[] args ) {

        ArrayList<Integer> girls = new ArrayList<Integer>();

        for ( int i = 0 ; i < 101; i++ ) {
            girls.add( i );
        }

        ParkPilkeun20170131 lcp = new ParkPilkeun20170131();
        girls = lcp.meeting( girls, false );

        System.out.println( girls.size() );
        System.out.println(  girls.get( 0 ) );
    }
}
