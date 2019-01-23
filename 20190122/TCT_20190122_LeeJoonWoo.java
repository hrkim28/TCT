package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
public class TCT_20190122_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("전체 계단수를 입력하세요.");
        System.out.println("예시:4");
        
        String input = sc.next();
        int stepCount = Integer.parseInt(input);
        
        System.out.println("계단의 값을 입력하세요. 콤마로 구분하세요.");
        System.out.println("예시:10,20,15,25,10,20");
        
        input = sc.next();
        String stepValue[] = input.split(",");
        
        //선택된 Step의 순서를 입력함
        HashMap selectedStepCount = new HashMap();
        //Skip된 Step의 순서를 입력함
        HashMap skippedStepCount =  new HashMap();
        
        
        
        /* 계단의 Max 값부터 선택을 하도록 하고 위 아래 계단으로 모두 선택되어 있으면 선택하지 못하고 Skip 함*/
        boolean selectedStep = true;
        boolean skippedStep = true;
        int stepMaxValue =0;
        int stepMaxValueIndex=0;
        
        //마지막 계단은 무조건 선택되도록 함
        selectedStepCount.put(stepCount-1, stepValue[stepCount-1]);
        
        while(true){
            for(int i=0; i< stepCount; i++){
                for(int j=0; j< selectedStepCount.size(); j++){
                    if( selectedStepCount.size() > 0 && selectedStepCount.get(i) != null){
                        selectedStep = false;
                    }
                }
                for(int k=0; k< skippedStepCount.size(); k++){
                    if( skippedStepCount.size() > 0 && skippedStepCount.get(i)!= null){
                        skippedStep = false;
                    }
                }
                
                if(selectedStep && skippedStep){
                    if (Integer.parseInt(stepValue[i]) > stepMaxValue) { 
                        stepMaxValue = Integer.parseInt(stepValue[i]);  
                        stepMaxValueIndex = i;
                    }
                }
                selectedStep  = true;
                skippedStep = true;
            }
            //위 아래로 선택된 계단 값이 이미 있으면 Skip함
            if(selectedStepCount.get(stepMaxValueIndex-1) != null &&  selectedStepCount.get(stepMaxValueIndex+1) != null ){
                skippedStepCount.put(stepMaxValueIndex, Integer.toString(stepMaxValue));
            }else{
                //위 아래 둘중에 하나라도 비워져 있는 경우 선택값에 넣도록 함
                selectedStepCount.put(stepMaxValueIndex, Integer.toString(stepMaxValue));
            }
            stepMaxValue = 0;
            //모든 계산이 선택되거나   Skip 되면 멈춥니다.
            if((selectedStepCount.size() + skippedStepCount.size()) == stepCount){
                break;
            }
            
        }
        
        int result=0;
        int count=0;
        
        //선택된 계산의 값을 더합니다.
        Collection values = selectedStepCount.values();
        Object[] valueInt = values.toArray();
        for(int i=0; i< valueInt.length; i++){
            count = Integer.parseInt( (String)valueInt[i]);
            result = result + count;
                        
        }
    
        System.out.println("===================================="); 
        System.out.println("result:"+result);
        System.out.println("====================================");

    }

}
