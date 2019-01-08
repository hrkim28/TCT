import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class baseball {

    /**
     *[2017.02.02 오늘의 문제]
문제 : 야구게임
컴퓨터가 생성한 임의의 숫자 3개와 입력받은 숫자 3개를 비교하여 Strike, Ball 결과를 출력합니다.
3개 숫자를 모두 맞추면 strike out 으로 게임 종료!!
[조건]
컴퓨터가 생성한 임의의 숫자 3개는 서로 중복되면 안됩니다.
입력받는 숫자 3개에 대해, 컴퓨터가 생성한 임의의 숫자와 "자릿수, 숫자가 같으면 스트라이크" "숫자가 같고 자릿수가 다르면 볼" 을 출력합니다.
컴퓨터가 생성한 임의의 숫자와 입력받는 숫자가 일치하면 게임이 종료되며 시도횟수와 함께 게임종료 메시지를 출력합니다.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Random rand = new Random();
        List<Integer> randList = new ArrayList<Integer>();
        int temp;
        for(int initInx = 0; initInx < 3; initInx++){
            temp = rand.nextInt(10);
            if(randList.contains(temp)){
                initInx--;
                continue;
            }else{
                randList.add(temp);
            }
        }
                while(true){
            int ball = 0;
            int strike = 0;
            List<Integer> tempList = new ArrayList<Integer>();
            for(int index = 0; index < 3; index++){
                System.out.print((index+1)+" 번째 숫자를 입력하세요.");
                Scanner in = new Scanner(System.in);
                int tempNum = in.nextInt();
                if(tempList.contains(tempNum)){
                    System.out.println("중복!! 숫자를 다시 입력하세요!");
                    index--;
                    continue;
                }else if(tempNum<0 || tempNum>9){
                    System.out.println("0부터 9까지 한자리 수를 입력하세요");
                    index--;
                    continue;
                }
                else{
                    tempList.add(tempNum);
                }
            }
            System.out.println(tempList);

            for(int inx = 0; inx < randList.size(); inx++){
                for(int jnx = 0; jnx < tempList.size(); jnx++){
                    if(randList.get(inx) == tempList.get(jnx)){
                        ball++;
                        if(inx == jnx){
                            ball--;
                            strike++;
                        }
                    }
                }
            }
            System.out.println(ball+" Ball and "+strike+" Strike\n");
            if(strike == 3){
                System.out.println("strike out!");
                break;
            }
        }
    }

}
