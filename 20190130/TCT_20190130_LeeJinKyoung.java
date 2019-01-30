import java.util.ArrayList;

public class TCT_20190130_LeeJinKyoung {

    class CodeMonster{
        private int year = 0;
        private int rank = 0;
        private int reward = 0;
        private int winnerCnt = 0;
        private int accumulateWinCnt = 0;
        
        CodeMonster(int year, int rank, int reward, int winnerCnt, int accumulateWinCnt){
            this.year = year;
            this.rank = rank;
            this.reward = reward;
            this.winnerCnt = winnerCnt;
            this.accumulateWinCnt = accumulateWinCnt + winnerCnt;
        }
        
        public int getYear(){
            return year;
        }
        
        public void setYear(int year){
            this.year = year;
        }
        
        public int getRank(){
            return rank;
        }
        
        public void setRank(int rank){
            this.rank = rank;
        }
        
        public int getReward(){
            return reward;
        }
        
        public void setReward(int reward){
            this.reward = reward;
        }
        
        public int getWinnerCnt(){
            return winnerCnt;
        }
        
        public void setWinnerCnt(int winnerCnt){
            this.winnerCnt = winnerCnt;
        }
        
        public int getAccumulateWinCnt(){
            return accumulateWinCnt;
        }
        
        public void setAccumulateWinCnt(int accumulateWinCnt){
            this.accumulateWinCnt = accumulateWinCnt;
        }
    }
    
    public static void main(String[] args){
        TCT_20190130_LeeJinKyoung test = new TCT_20190130_LeeJinKyoung();
        
        ArrayList<CodeMonster> com2018 = test.initCompetition2018();
        ArrayList<CodeMonster> com2019 = test.initCompetition2019();
         
        test.calucator( "8 4", com2018, com2019 );
        test.calucator( "13 19", com2018, com2019 );
        test.calucator( "8 10", com2018, com2019 );
        test.calucator( "18 18", com2018, com2019 );
        test.calucator( "8 25", com2018, com2019 );
        test.calucator( "13 16", com2018, com2019 );
    }

    private ArrayList<CodeMonster> initCompetition2018(){
        /*
        2018
        1등   500만원   1명
        2등  300만원   2명
        3등  200만원   3명
        4등  50만원    4명
        5등  30만원    5명
        6등  10만원    6명
        */
        ArrayList<CodeMonster> comp = new ArrayList<CodeMonster>();        
        CodeMonster c1= new CodeMonster(2018, 1, 500, 1, 0);
        comp.add(c1);
        CodeMonster c2= new CodeMonster(2018, 2, 300, 2, c1.getAccumulateWinCnt());
        comp.add(c2);
        CodeMonster c3= new CodeMonster(2018, 3, 200, 3, c2.getAccumulateWinCnt());
        comp.add(c3);
        CodeMonster c4= new CodeMonster(2018, 4, 50, 4, c3.getAccumulateWinCnt());
        comp.add(c4);
        CodeMonster c5= new CodeMonster(2018, 5, 30, 5, c4.getAccumulateWinCnt());
        comp.add(c5);
        CodeMonster c6= new CodeMonster(2018, 6, 10, 6, c5.getAccumulateWinCnt());
        comp.add(c6);
        return comp;
    }
    
    private ArrayList<CodeMonster> initCompetition2019(){
        /*
        2019
        1등  512만원   1명
        2등  256만원   2명
        3등  128만원   4명
        4등  64만원    8명
        5등  32만원    16명
        */
        ArrayList<CodeMonster> comp = new ArrayList<CodeMonster>();
        CodeMonster c1= new CodeMonster(2019, 1, 512, 1, 0);
        comp.add(c1);
        CodeMonster c2= new CodeMonster(2019, 2, 256, 2, c1.getAccumulateWinCnt());
        comp.add(c2);
        CodeMonster c3= new CodeMonster(2019, 3, 128, 4, c2.getAccumulateWinCnt());
        comp.add(c3);
        CodeMonster c4= new CodeMonster(2019, 4, 64, 8, c3.getAccumulateWinCnt());
        comp.add(c4);
        CodeMonster c5= new CodeMonster(2019, 5, 32, 16, c4.getAccumulateWinCnt());
        comp.add(c5);
        return comp;
    }
    /**
     *
     * @param str
     */
    private void calucator(String input, ArrayList<CodeMonster> com2018, ArrayList<CodeMonster> com2019){
        String[] arNum = input.split("[ ]");
        
        System.out.println(input);
        
        int myRank2018 = Integer.parseInt(arNum[0]);
        int myRank2019 = Integer.parseInt(arNum[1]);           
        int myReward = 0;
        
        for(int inx = 1; inx < com2018.size(); inx++) {
            if(com2018.get(inx-1).getAccumulateWinCnt() == myRank2018 ){
                myReward = com2018.get(inx-1).getReward();
                break;
            } else if(com2018.get(inx-1).getAccumulateWinCnt() < myRank2018 && myRank2018 <= com2018.get(inx).getAccumulateWinCnt() ){
                myReward = com2018.get(inx).getReward();
                break;
            }
        }
        
        for(int inx = 1; inx < com2019.size(); inx++) {
            if(com2019.get(inx-1).getAccumulateWinCnt() == myRank2019 ){
                myReward = myReward + com2019.get(inx-1).getReward();
                break;
            } else if(com2019.get(inx-1).getAccumulateWinCnt() < myRank2019 && myRank2019 <= com2019.get(inx).getAccumulateWinCnt() ){
                myReward = myReward +  com2019.get(inx).getReward();
                break;
            }
        }
        
        System.out.println(myReward + "만원입니다.");
    }
}
