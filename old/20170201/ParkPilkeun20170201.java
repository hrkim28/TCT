package com.test;

import java.util.Random;

public class ParkPilkeun20170201 {

    

    static int DiceGame() {
        Random random = new Random();

        int a = random.nextInt( 6 ) + 1;
        int b = random.nextInt( 6 ) + 1;

        System.out.println( a + " " + b );

        int sum = a + b;

        if ( a == b )
            sum = sum + DiceGame();

        return sum;
    }

    public static void main( String[] args ) {
        

        System.out.println( DiceGame() );
    }
}
