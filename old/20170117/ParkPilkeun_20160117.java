package com.test;

public class Test1 {

    public void compress( String str ) {
        
        if ( str.length() > 0 ) {
            StringBuffer strBuff = new StringBuffer();

            String tempStr = "";
            int tempCnt = 0;

            for ( int i = 0; i< str.length(); i++ ) {

                if ( tempStr.equals( str.substring( i, i+1 ) ) ) {
                    tempCnt++;
                } else {
                    if ( i != 0 ) {
                        if ( tempCnt != 1 ) {
                            strBuff.append( tempStr + tempCnt );
                        } else {
                            strBuff.append( tempStr );
                        }
                    }

                    tempStr = str.substring( i, i+1 );
                    tempCnt = 1;

                    if ( i == str.length() - 1 ) {
                        if ( tempCnt != 1 ) {
                            strBuff.append( tempStr + tempCnt );
                        } else {
                            strBuff.append( tempStr );
                        }
                    }
                }
            }

            System.out.println( str + " ::: " + strBuff.toString() );
        }
    }

    public static void main( String[] args ) {
        Test1 test = new Test1();

        test.compress( "apple" );
    }
}
