package com.LCP;

public class Youngmiwon_20170118 {
    
    public static void main(String[] args) {
        
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String arr[] = input.split("");
        int row = 3;
        int col = 4;
        int maxCnt = 10;
        boolean isBack = false;
        int cursor = 0;
        
        // 가로출력
        for( int inx = 0; inx < row; inx++ ){
            for( int jnx = 0; jnx <= col; jnx++ ){
                if( cursor == maxCnt ){
                    isBack = true;
                }
                
                if( isBack ){
                    if( cursor > 1 ){
                        System.out.print( arr[--cursor] );
                    }
                    else if( cursor == 1 ){
                        System.out.print( arr[cursor] );
                    }
                    else{
                        System.out.print( "A" );
                    }
                }
                else{
                    System.out.print( arr[++cursor] );
                }
                if( jnx == col - 1 ){
                    break;
                }
            }
            System.out.println();
        }
        
        // 세로출력
        String arr2[][] = new String[col][row];
        cursor = 0;
        isBack = false;
        for( int inx = 0; inx < col; inx++ ){
            for( int jnx = 0; jnx < row; jnx++ ){
                if( cursor == maxCnt ){
                    isBack = true;
                }
                
                if( isBack ){
                    if( cursor > 1 ){
                        arr2[inx][jnx] = arr[--cursor];
                    }
                    else if( cursor == 1 ){
                        arr2[inx][jnx] = arr[cursor];
                    }
                    else{
                        arr2[inx][jnx] = "A";
                    }
                }
                else{
                    arr2[inx][jnx] = arr[++cursor];
                }
                if( jnx == row - 1 ){
                    break;
                }
            }
        }

        for( int jnx = 0; jnx < row; jnx++ ){
            for( int inx = 0; inx < col; inx++ ){
                System.out.print( arr2[inx][jnx] );
            }
            System.out.println();
        }
    }
    
}
