/**
 * ===========================================
 * System Name : MC LAUS
 * Program ID : test11111.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 1. 24.  seongmo1.kim   Initial
 * ===========================================
 */
package com.lge.laus.spec.controller;

/**
 * @author seongmo1.kim
 *
 */
public class test11111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int inx = 1; inx <= 10000; inx++){
			if(inx < 10){
				if(inx%7 == 0){
					cnt++;
				}
			}else if(inx < 100){
				if(inx/10==7){
					cnt++;
				}
				if((inx%10)==7){
					cnt++;
				}
			}else if(inx < 1000){
				if(inx/100==7){
					cnt++;
				}
				if((inx%100)/10==7){//십의자리/10=7
					cnt++;
				}
				if(((inx%100)%10)==7){//일의자리
					cnt++;
				}
			}else if(inx == 10000){
				continue;
			}else{
				if((inx/1000)==7){
					cnt++;
				}
				if((inx%1000)/100==7){
					cnt++;
				}
				if(((inx%1000)%100)/10==7){
					cnt++;
				}
				if((((inx%1000))%100)%10==7){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
