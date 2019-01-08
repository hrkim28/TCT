package com.test;

import java.util.Random;
import java.util.Scanner;

public class ParkPilkeun20170202 {

    Random rnd = new Random();
    int[] baseBall = new int[3];

    public void setBaseBall() {
        int index = 0;

        while( index < baseBall.length ) {

            int nextVal = rnd.nextInt( 8 ) + 1;

            boolean same = false;

            for ( int i = 0; i < index; i++ ) {
                if ( baseBall[i] == nextVal ) {
                    same = true;
                }
            }

            if ( !same ) {
                baseBall[index] = nextVal;
                index++;
            }
        }
    }

    public void game() {
        int[] my = new int[3];

        Scanner scn = new Scanner( System.in );
        int strike = 0;
        int ball = 0;
        int cnt = 1;

        while ( true ) {
            while ( my[0] < 1 || my[0] > 9 ) {
                System.out.println( "1. 1~9 사이의 숫자를 입력하시오" );
                my[0] = scn.nextInt();
            }
            while ( my[1] < 1 || my[1] > 9 ) {
                System.out.println( "2. 1~9 사이의 숫자를 입력하시오" );
                my[1] = scn.nextInt();
    
                if ( my[0] == my[1] )
                    my[1] = 0;
            }
            while ( my[2] < 1 || my[2] > 9 ) {
                System.out.println( "3. 1~9 사이의 숫자를 입력하시오" );
                my[2] = scn.nextInt();
    
                if ( my[0] == my[2] || my[1] == my[2] )
                    my[2] = 0;
            }

            for ( int i = 0; i < baseBall.length; i++ ) {
                for ( int j = 0; j < my.length; j++ ) {
                    if ( i == j && baseBall[i] == my[j] ) {
                        strike++;
                    } else if ( i != j && baseBall[i] == my[j] ) {
                        ball++;
                    }
                }
            }

            System.out.println( strike + " Strike " + ball + " Ball");
            if ( strike == 3 ) {
                System.out.println( cnt + " 회만에 Strike Out!!!" );
                break;
            }

            my[0] = 0;
            my[1] = 0;
            my[2] = 0;
            strike = 0;
            ball = 0;
        }

        scn.close();
    }

    public static void main( String[] args ) {
        ParkPilkeun20170202 lcp = new ParkPilkeun20170202();
        lcp.setBaseBall();
        lcp.game();
    }
}
