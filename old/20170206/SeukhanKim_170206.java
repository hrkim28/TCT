package com.lcptest;

import java.util.Random;
import java.io.;
import java.util.;

public class Test0206 {

	public static void main (String arg[]) throws Exception  {
		
		Random random = new Random();
		Vector vector = new Vector();
		for( int inx = 1; inx= 45; inx++ ) vector.addElement( new Integer( inx ) );

		int rottoNum[] = new int[6];
		int tmpIndex = 0;
		for( int jnx = 0; jnx  rottoNum.length; jnx++ ) {
			tmpIndex = random.nextInt( vector.size() );
			rottoNum[jnx] =  (Integer)vector.elementAt( tmpIndex );
			System.out.println( ranNum[+jnx+]   + rottoNum[jnx] );
			vector.remove( tmpIndex );
		}

		System.out.print(Selected No.  );
		for ( int jnx = 0 ; jnx  rottoNum.length ; jnx++ ) {
			System.out.print(rottoNum[jnx] +  );
		}

		int tempNum = 0;
		for ( int knx = 0 ; knx  rottoNum.length ; knx++ ) {
			for ( int lnx = knx+1 ; lnx  rottoNum.length ; lnx++ ) {
				if ( rottoNum[knx]  rottoNum[lnx] ) {
					tempNum = rottoNum[knx];
					rottoNum[knx] = rottoNum[lnx];
					rottoNum[lnx] = tempNum;
				}
			}
		}

		System.out.print(nSorted No.  );
		for ( int lnx = 0 ; lnx  rottoNum.length ; lnx++ ) {
			System.out.print(rottoNum[lnx] +  );
		}
	}
	

}
