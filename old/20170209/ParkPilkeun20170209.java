package com.test;

import java.util.ArrayList;

public class ParkPilkeun20170209 {

    public ArrayList<Integer> reset( ArrayList<Integer> data, int from, int to ) {
        ArrayList<Integer> newData = new ArrayList<Integer>();

        int cnt = 1;

        for ( int i = 0; i<data.size(); i++) {
            if ( i >= from - 1 && i <= to - 1 ) {
                newData.add( data.get( to - cnt ) );
                cnt++;
            } else {
                newData.add( data.get( i ) );
            }
        }
        
        return newData;
    }

    public static void main( String[] args ) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for ( int i = 0; i<20; i++) {
            data.add( i + 1 );
        }

        ParkPilkeun20170209 lcp = new ParkPilkeun20170209();
        data = lcp.reset( data, 3, 7 );
        System.out.println(  data );
        data = lcp.reset( data, 4, 6 );
        System.out.println(  data );
        data = lcp.reset( data, 5, 5 );
        System.out.println(  data );
    }
}
