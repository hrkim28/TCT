package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190131_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("��ü �� ������ �Է��ϼ���.");
        System.out.println("����:4");
        
        String input = sc.next();
        int  numCount = Integer.parseInt(input);
        
        System.out.println("�� �ܾ �Է��� ������ŭ �Է� �ϼ���.");
        ArrayList<String> inputValue = new ArrayList();
        //�ߺ��� �����ϸ鼭 �Է�
        for(int i=0; i<numCount; i++){
        	input = sc.next();
        	if (!inputValue.contains(input)) {
        		inputValue.add(input);
            }
        }
        
        //���ĺ� ������� ��Ʈ
        Collections.sort(inputValue, new Comparator<String>() {
            @Override
            public int compare(String item, String t1) {
                String s1 = item;
                String s2 = t1;
                return s1.compareToIgnoreCase(s2);
            }
        });
        
        //�����Ʈ�� ����ؼ� ���ڰ����� ���� �͵��� ������ �����´�
        int cnt =0;
        String temp ="";
        for(int i=inputValue.size(); i>0; i--) {
            //
            for (int j=0; j<i-1; j++) {
                cnt++;
                if(inputValue.get(j).length() > inputValue.get(j+1).length()) {
                    temp = inputValue.get(j); 
                    inputValue.set(j,inputValue.get(j+1));
                    inputValue.set(j+1,temp);
                }
            }
        }

        //��� ���
        for(int i=0; i<inputValue.size(); i++){
        	System.out.println(inputValue.get(i));
        }
    }
}
