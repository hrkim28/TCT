package Algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 19.11.26
 * @desc 막걸리 중량 배분과 관련된 배열 알고리즘 문제
 * @author 박병진
 * @version 1.0.0
 */
public class Distribution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("막걸리 주전자의 갯수를 입력하세요.");
		int alchol = sc.nextInt();
		
        System.out.println("인원수를 입력해주세요");
        int person = sc.nextInt();
        
        List<Integer> alcholList = new ArrayList<Integer>();
        int alcholSum = 0;
        
        for (int i = 0; i < alchol; i++) {
            if (i == 0)
                sc.nextLine();
            int al = Integer.parseInt(sc.nextLine());
            alcholList.add(al);
            alcholSum+=al;
        }
        
        sc.close();

		int alcholQauntity = alcholSum / person;

		int personSum = 0;

		for (Integer al : alcholList) {
			personSum += al / alcholQauntity;
		}
		
		while (true) {
			if (personSum == person)
				break;
			else {
				personSum = 0;
				alcholQauntity--;
				for (Integer al : alcholList) {
					personSum += al / alcholQauntity;
				}
			}
		}
		System.out.println(alcholQauntity);
	}
}
