package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190130_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	//1차 대회 상금을 저장
    	ArrayList<String[]> firstPrize = new ArrayList();
    	 	
    	String[] prizeMember11 =  {"500","1"};
    	String[] prizeMember12 =  {"300","2"};
    	String[] prizeMember13 =  {"200","3"};
    	String[] prizeMember14 =  {"50","4"};
    	String[] prizeMember15 =  {"30","5"};
    	String[] prizeMember16 =  {"10","6"};
    	
    	firstPrize.add(prizeMember11);
    	firstPrize.add(prizeMember12);
    	firstPrize.add(prizeMember13);
    	firstPrize.add(prizeMember14);
    	firstPrize.add(prizeMember15);
    	firstPrize.add(prizeMember16);
    	
    	//2차 대회 상금을 저장
    	ArrayList<String[]> secondPrize = new ArrayList();
    	 	
    	String[] prizeMember21 =  {"512","1"};
    	String[] prizeMember22 =  {"256","2"};
    	String[] prizeMember23 =  {"128","4"};
    	String[] prizeMember24 =  {"64","8"};
    	String[] prizeMember25 =  {"32","16"};
    	
    	secondPrize.add(prizeMember21);
    	secondPrize.add(prizeMember22);
    	secondPrize.add(prizeMember23);
    	secondPrize.add(prizeMember24);
    	secondPrize.add(prizeMember25);
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("전체 수 갯수를 입력하세요.");
        System.out.println("예시:4");
        
        String input = sc.next();
        int  numCount = Integer.parseInt(input);
        
        System.out.println("숫자를 입력하세요.");
        String inputValue[] = new String[numCount*2];
                
        for(int i=0; i<numCount*2; i++){
        	input = sc.next();
        	inputValue[i] = input;
        }
               
        int firstRanking = 0;
        int secondRanking = 0;
        int sumRanking = 0;
        int firstPrizeMoney = 0;
        int secondPrizeMoney = 0;
        ArrayList<String> sumPrize = new ArrayList();
        for(int i=0; i< inputValue.length; i=i+2){
        	  
        	//등수를 입력 함
        	firstRanking = Integer.parseInt(inputValue[i]);
        	secondRanking = Integer.parseInt(inputValue[i+1]);
            
            
            for(int j=0; j<firstPrize.size(); j++){
            	sumRanking = sumRanking + Integer.parseInt(firstPrize.get(j)[1]);
            	if(firstRanking <= sumRanking){
            		firstPrizeMoney = Integer.parseInt(firstPrize.get(j)[0]);
            		break;
            	}
            }
            sumRanking = 0;
            for(int j=0; j<secondPrize.size(); j++){
            	sumRanking = sumRanking + Integer.parseInt(secondPrize.get(j)[1]);
            	if(secondRanking <= sumRanking){
            		secondPrizeMoney = Integer.parseInt(secondPrize.get(j)[0]);
            		break;
            	}
            }
            
            sumPrize.add(String.valueOf(firstPrizeMoney*10000+secondPrizeMoney*10000));
            
            sumRanking = 0;
            firstRanking =0;
            secondRanking =0;
            firstPrizeMoney = 0;
            secondPrizeMoney = 0;
        }
        
        for(int i=0; i<sumPrize.size(); i++){
        	System.out.println(sumPrize.get(i));
        }
    }
}
