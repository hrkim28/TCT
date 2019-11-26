package Algorithm;
import java.util.Scanner;

/**
 * @date 19.11.25
 * @desc �з�Ƽ �˻���� ���õ� �迭 �˰��� ����
 * @author �ں���
 * @version 1.0.0
 */
class Parity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("����� ũ�⸦ �Է��ϼ���.");
        int arraySize = sc.nextInt();
        int[][] parityCheck = new int[arraySize][arraySize];
        System.out.println("����� �Է����ּ���.(�� ������ �����ؼ� �Է����ּ���.)");

        for (int i = 0; i < parityCheck.length; i++) {
            if (i == 0)
                sc.nextLine();
            String arrayRow = sc.nextLine();
            String[] rowElement = arrayRow.split("\\s");
            for (int j = 0; j < rowElement.length; j++) {
                // System.out.println(rowElement[j]);
                parityCheck[i][j] = Integer.parseInt(rowElement[j]);
            }
        }
        sc.close();

        int rowFailCnt = 0;
        int colFailCnt = 0;
        int rowIdx = 0;
        int colIdx = 0;

        // ���� for���� Ȱ���Ͽ� parity�˻� ����
        for (int i = 0; i < parityCheck.length; i++) {

            int sumRow = 0;
            int sumCol = 0;
            // ��� ���� ������� 0���� �ʱ�ȭ

            for (int j = 0; j < parityCheck.length; j++) {

                if (parityCheck[i][j] == 1)
                    sumRow++;
                if (parityCheck[j][i] == 1)
                    sumCol++;
                // �ش� ��Ұ��� 1�� ��쿡 ��� �� ����տ� 1�� ������
                // cf) ���簢�� ����̱⿡ loop�� �ѹ��� ����Ͽ� index�� �ٲپ� ��Ұ� Ȯ��
            }
            if (sumRow % 2 == 1) {
                rowFailCnt++;
                if (rowFailCnt == 2)
                    break;
                rowIdx = (i + 1);
            }
            if (sumCol % 2 == 1) {
                colFailCnt++;
                if (colFailCnt == 2)
                    break;
                colIdx = (i + 1);
            }
            // ������� Ȧ���� ��� parity�˻翡�� fail�� ����̱⿡ failCount 1�� �����԰� ���ÿ� ����� index�� 1�� ���Ѱ���
            // ������
            // failCount�� 2�� �� ���� ���̻� loop�� ���� �ǹ̰� ���� ������ break�� ��������.
            // (����� ũ�Ⱑ Ŀ������ if���꺸�� loop�� ���°��� ġ�����̶� �Ǵ�)
        }
        if (parityCheck.length == 1)
            System.out.println("Corrupt");
        // ����� ũ�Ⱑ 1�� ��� ������ 1�� �Է��ؾ��Ѵٴ� ���������� �ֱ⶧���� "Corrupt" ���
        else
            isParity(rowFailCnt, colFailCnt, rowIdx, colIdx);
    }

    /**
     * ����� parity �˻翡�� fail�� Ƚ���� ���� �б��ϴ� Method 1. ����� parity �˻� failȽ���� 0�� ��� "OK"
     * ��� 2. ����� parity �˻� failȽ���� ���� 1�� ��� �ش� ��� �� index�� ��� 3. �� �̿��� ���� "Corrupt"
     * ��� cf) �� Ȥ�� �� parity �˻� failȽ���� 1�� ��쿡�� �ش� ���� ����� �ٸ� parity�˻��� ������� �ٲ�� ������
     * ����
     * 
     * @param rowCnt �� parity �˻翡�� fail�� Ƚ��
     * @param colCnt �� parity �˻翡�� fail�� Ƚ��
     */
    public static void isParity(int rowCnt, int colCnt, int rowIdx, int colIdx) {
        if (rowCnt == 0 && colCnt == 0)
            System.out.println("OK");
        else if (rowCnt == 1 && colCnt == 1)
            System.out.println("Change bit (" + rowIdx + "," + colIdx + ")");
        else
            System.out.println("Corrupt");
    }
}