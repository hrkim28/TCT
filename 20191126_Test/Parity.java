package Algorithm;
import java.util.Scanner;

/**
 * @date 19.11.25
 * @desc 패러티 검사법과 관련된 배열 알고리즘 문제
 * @author 박병진
 * @version 1.0.0
 */
class Parity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("행렬의 크기를 입력하세요.");
        int arraySize = sc.nextInt();
        int[][] parityCheck = new int[arraySize][arraySize];
        System.out.println("행렬을 입력해주세요.(행 단위로 개행해서 입력해주세요.)");

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

        // 이중 for문을 활용하여 parity검사 진행
        for (int i = 0; i < parityCheck.length; i++) {

            int sumRow = 0;
            int sumCol = 0;
            // 행과 열의 요소합을 0으로 초기화

            for (int j = 0; j < parityCheck.length; j++) {

                if (parityCheck[i][j] == 1)
                    sumRow++;
                if (parityCheck[j][i] == 1)
                    sumCol++;
                // 해당 요소값이 1인 경우에 행과 열 요소합에 1씩 더해줌
                // cf) 정사각형 행렬이기에 loop를 한번만 사용하여 index만 바꾸어 요소값 확인
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
            // 요소합이 홀수인 경우 parity검사에서 fail한 경우이기에 failCount 1씩 증가함과 동시에 행과열 index에 1을 더한값을
            // 저장함
            // failCount가 2가 된 경우는 더이상 loop를 도는 의미가 없기 때문에 break로 빠져나옴.
            // (행렬의 크기가 커질수록 if연산보다 loop를 도는것이 치명적이라 판단)
        }
        if (parityCheck.length == 1)
            System.out.println("Corrupt");
        // 행렬의 크기가 1인 경우 무조건 1을 입력해야한다는 제약조건이 있기때문에 "Corrupt" 출력
        else
            isParity(rowFailCnt, colFailCnt, rowIdx, colIdx);
    }

    /**
     * 행과열 parity 검사에서 fail한 횟수에 따라 분기하는 Method 1. 행과열 parity 검사 fail횟수가 0인 경우 "OK"
     * 출력 2. 행과열 parity 검사 fail횟수가 각각 1인 경우 해당 행과 열 index를 출력 3. 그 이외의 경우는 "Corrupt"
     * 출력 cf) 행 혹은 열 parity 검사 fail횟수가 1인 경우에도 해당 숫자 변경시 다른 parity검사의 결과값이 바뀌기 때문에
     * 실패
     * 
     * @param rowCnt 행 parity 검사에서 fail한 횟수
     * @param colCnt 열 parity 검사에서 fail한 횟수
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