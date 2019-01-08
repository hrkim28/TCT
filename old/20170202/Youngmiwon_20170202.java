package com.LCP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Youngmiwon_20170202 {
    
    public static void main(String[] args) {
        int strikeCnt = 0;
        int ballCnt = 0;
        
        int[] numArr = new int[3];
        numArr[0] = (int)(Math.random() * 10);
        numArr[1] = (int)(Math.random() * 10);
        numArr[2] = (int)(Math.random() * 10);
        
        while( numArr[0] == numArr[1] ){
            numArr[1] = (int)(Math.random() * 10);
        }
        
        while( numArr[0] == numArr[2] || numArr[1] == numArr[2] ){
            numArr[2] = (int)(Math.random() * 10);
        }
        
        //System.out.println( numArr[0] + " : " + numArr[1] + " : " + numArr[2] );

        int[] inputNumArr = new int[3];
        Scanner sc = new Scanner( System.in );
        
        while( strikeCnt < 3 ){
            inputNumArr[0] = -1;
            inputNumArr[1] = -1;
            inputNumArr[2] = -1;
            strikeCnt = 0;
            ballCnt = 0;
            
            try {
                
                while( inputNumArr[0] < 0 || inputNumArr[0] > 9){
                    System.out.println( "1) 0~9 사이의 숫자를 입력하세요." );
                    inputNumArr[0] = sc.nextInt();
                }
                while( inputNumArr[1] < 0 || inputNumArr[1] > 9 || inputNumArr[0] == inputNumArr[1] ){
                    System.out.println( "2) 0~9 사이의 숫자를 입력하세요. (첫번째 숫자와 다른 숫자 입력)" );
                    inputNumArr[1] = sc.nextInt();
                }
                while( inputNumArr[2] < 0 || inputNumArr[2] > 9 || inputNumArr[0] == inputNumArr[2] || inputNumArr[1] == inputNumArr[2] ){
                    System.out.println( "3) 0~9 사이의 숫자를 입력하세요. (첫번째,두번째 숫자와 다른 숫자 입력)" );
                    inputNumArr[2] = sc.nextInt();
                }

                System.out.println( "=====================================" );
                System.out.println( "Input > " + inputNumArr[0] + " : " + inputNumArr[1] + " : " + inputNumArr[2] );
                
            } catch (InputMismatchException ime) {
                System.err.println("에러! 정수가 아닌 실수/문자를 입력하셨군요: " + ime);
                System.exit(1);
            }
            
            // 처리
            for( int inx = 0; inx < inputNumArr.length; inx++ ){
                for( int jnx = 0; jnx < numArr.length; jnx++ ){
                    if( inputNumArr[inx] == numArr[jnx]  ){
                        if( inx == jnx ){
                            strikeCnt++;
                        }
                        else{
                            ballCnt++;
                        }
                        break;
                    }
                }
            }

            System.out.println( "Result > " + strikeCnt + " strike / " + ballCnt + " ball" );
            System.out.println( "=====================================" );
        }

        sc.close();
        System.out.println( "Mission completed!!!!!" );
    }
    
}
