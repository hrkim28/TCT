package Algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 19.11.26
 * @desc ���ɸ� �߷� ��а� ���õ� �迭 �˰��� ����
 * @author �ں���
 * @version 1.0.0
 */
public class Distribution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ɸ� �������� ������ �Է��ϼ���.");
		int alchol = sc.nextInt();
		
        System.out.println("�ο����� �Է����ּ���");
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
