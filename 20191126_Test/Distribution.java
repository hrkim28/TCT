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
		alcholSum = calculateAlcholSum(sc, alchol, alcholList, alcholSum); //���ɸ� �ѷ� ���
		sc.close();

		int alcholQauntity = alcholSum / person; //���ɸ� �ѷ��� �ο����� ���� ���ɸ���

		int personSum = calculatePersonSum(alcholList, alcholQauntity); //�ǽ������� ��еǴ� �ο��� ���

		alcholQauntity = getResult(person, alcholList, alcholQauntity, personSum); //���� ����� ����
		
		System.out.println(alcholQauntity);
	}

	/**
	 * ���ɸ� �ѷ��� ����ϱ� ���� Method
	 * Scanner�� �Էµʰ� ���ÿ� List�� �߰��� ���ְ�, ���ɸ� �ѷ��� �����ش�.
	 * cf) Loop�� ���� Ƚ���� ���̱� ���� Scanner �Է°� ���ÿ� ���ɸ� �ѷ� �ջ� Logic�� ����
	 * 
	 * @param sc Scanner �Է�
	 * @param alchol ���ɸ� ������ ����
	 * @param alcholList ���ɸ� ���� ���� List
	 * @param alcholSum ���ɸ� �ѷ� ���ϱ� ���� int ����(0���� �ʱ�ȭ)
	 * @return int ���ɸ� �ѷ��� ����ؼ� ��ȯ
	 */
	private static int calculateAlcholSum(Scanner sc, int alchol, List<Integer> alcholList, int alcholSum) {

		for (int i = 0; i < alchol; i++) {
			if (i == 0)
				sc.nextLine();
			int al = sc.nextInt();
			alcholList.add(al);
			alcholSum += al;
		}
		return alcholSum;
	}
	
	/**
	 * ���ɸ� ���� alcholQantity�� ���������� ���������� ��еǴ� �ο����� ���ϴ� Method
	 * ���ɸ� �� List�� Loop�� ���鼭 alcholQauntity�� ���� ������ �� ���ؼ� ���������� ��еǴ� �ο��� ���
	 * 
	 * @param alcholList ���Ÿ� ������ ���� �� �ִ� List
	 * @param alcholQauntity ���ɸ� �ѷ��� �ο����� ���� ���ɸ���
	 * @return
	 */
	private static int calculatePersonSum(List<Integer> alcholList, int alcholQauntity) {
		int personSum = 0;

		for (Integer al : alcholList) {
			personSum += al / alcholQauntity;
		}
		
		return personSum;
	}
	
	/**
	 * ���� ���ɸ� �й跮�� ����ϴ� Method
	 * ���� Loop�� ���鼭 ���� ���ɸ� �й跮�� ���
	 * 1. ���������� ��еǴ� �ο����� ���� �ο����� ������ ��� Loop�� ��������
	 * 2. ���� �ο����� ����ġ�ϴ� ��� personSum�� 0���� �ʱ�ȭ�ϰ�, alcholQauntity�� 1 ���ҽ�Ŵ
	 * 3. ������ alcholQauntity�� ���� ���ο� personSum ���
	 * 4. 1~3�� ���� �ݺ�
	 * 
	 * @param person ���� �ο���
	 * @param alcholList alcholList ���Ÿ� ������ ���� �� �ִ� List
	 * @param alcholQauntity alcholQauntity ���ɸ� �ѷ��� �ο����� ���� ���ɸ���
	 * @param personSum ���������� ��еǴ� �ο���
	 * @return
	 */
	private static int getResult(int person, List<Integer> alcholList, int alcholQauntity, int personSum) {
		
		while (true) {
			if (personSum == person) //���� �ο����� ���������� ��еǴ� �ο����� ������ ��� break
				break;
			else {
				personSum = 0;
				alcholQauntity--; //����ġ�� ��� 1�� ����
				for (Integer al : alcholList) {
					personSum += al / alcholQauntity; //personSum ����
				}
			}
		}
		return alcholQauntity;
	}
}
