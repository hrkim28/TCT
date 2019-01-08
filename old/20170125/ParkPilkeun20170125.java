package com.test;

import java.util.ArrayList;

public class ParkPilkeun20170125 {

    public static void main( String[] args ) {

        ArrayList<String> org = new ArrayList<String>();
        ArrayList<String> sort = new ArrayList<String>();

        org.add( "test" );
        org.add( "war" );
        org.add( "holiday" );
        org.add( "window" );
        org.add( "project" );

        for ( int i = 0; i < org.size() ; i++ ) {
            boolean notAdded = true;

            if ( i < sort.size() ) continue;

            if ( sort.size() == 0 ) { 
                sort.add( org.get( i ) );
                continue;
            }

            for ( int j = 0; j<sort.size(); j++ ) {
                if ( sort.get( j ).compareTo( org.get( i ) ) > 0 ) {
                    sort.add( j, org.get( i ) );
                    notAdded = false;
                    break;
                }
            }

            if ( notAdded )
                sort.add( org.get( i ) );
        }

        if ( sort.size() % 2 == 0 ) {
            System.out.println( sort.get( sort.size() / 2 - 1 ) );
        } else {
            System.out.println( sort.get( sort.size() / 2 ) );
        }
    }
}
