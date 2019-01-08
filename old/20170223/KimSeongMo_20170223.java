package test1;

import java.util.ArrayList;
import java.util.List;

public class ConvexHull {

    /*
     * 볼록 다각형 찾기
     *
     * 2차원 평면에 점들이 주어 졌을 때 가장 바깥쪽 점들을 이어서 모든 점들을 포함하는
     * 볼록 다각형을 만들고자 한다. 이때 연결되는 점들의 좌표를 모두 출력하시오.
     *
     * 예) input : (1,0), (1,1), (1,2), (1,-1), (2,1), (2,3), (-1,1), (-2,1),(-1,3),(-1,-1)
     *     output : (2,1), (2,3), (-1,3), (-2,1), (-1,-1), (1,-1)
     *
     * */
    public static void main(String[] args){
        List<ArrayList<Integer>> spots = new ArrayList<ArrayList<Integer>>();
        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        List<ArrayList<Integer>> doing =  new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> start;
        ArrayList<Integer> tempSpot;
        insertSpot(spots,1,0);
        insertSpot(spots,1,1);
        insertSpot(spots,1,2);
        insertSpot(spots,1,-1);
        insertSpot(spots,2,1);
        insertSpot(spots,2,3);
        insertSpot(spots,-1,1);
        insertSpot(spots,-2,1);
        insertSpot(spots,-1,3);
        insertSpot(spots,-1,-1);
        System.out.println(spots.toString());

        //시작점 찾기
        doing.addAll(spots);
        result.add(findStartPoint(spots));
        tempSpot = findStartPoint(spots);
        start = tempSpot;
        doing.remove(tempSpot);

        //다음 convex point 찾기
        while(true){
            tempSpot = findNextSpot(tempSpot,doing);
            doing.remove(tempSpot);
            result.add(tempSpot);
            if(findNextSpot(tempSpot,spots) == start){ //다음점과 시작점이 일치하면 종료
                break;
            }
        }
        System.out.println(result.toString());
    }

    public static ArrayList<Integer> findNextSpot(ArrayList<Integer> temp, List<ArrayList<Integer>> remain){
        ArrayList<Integer> newSpot = new ArrayList<Integer>();
        int x = temp.get(0);
        int y = temp.get(1);
        //(0,0)일땐??
        if(x >= 0 && y >= 0){//1사분면
            double tempAng = 180;
            for(ArrayList<Integer> spot : remain){
                int x2 = spot.get(0);
                double angle = getAngle(spot,temp);
                if(x2>x || spot == temp || angle > 0) continue;
                angle = -angle;
                if(angle <= tempAng){
                	tempAng = angle;
                    newSpot = spot;
                }
            }
        }else if(x <= 0 && y >= 0){//2사분면
            double tempAng = 180;
            for(ArrayList<Integer> spot : remain){
            	if(spot == temp) continue;
                int y2 = spot.get(1);
                if(y2>y)    continue;
                double angle = getAngle(spot,temp);
                if(angle < 0) angle = -(angle+180);
                else angle = -(angle-180);
                if(tempAng >= angle){
                    tempAng = angle;
                    newSpot = spot;
                }
            }
        }else if(x <= 0 && y <= 0){//3사분면
            double tempAng = 0;
            for(ArrayList<Integer> spot : remain){
            	if(spot == temp) continue;
                int x2 = spot.get(0);
                if(x2<x)    continue;
                double angle = getAngle(spot,temp);
                if(tempAng <= angle){
                    tempAng = angle;
                    newSpot = spot;
                }
            }
        }else{//4사분면
            double tempAng = 0;
            for(ArrayList<Integer> spot : remain){
            	if(spot == temp) continue;
                int y2 = spot.get(1);
                if(y2<y)    continue;
                double angle = getAngle(spot,temp)+90;
                if(tempAng <= angle){
                    tempAng = angle;
                    newSpot = spot;
                }
            }
        }
        return newSpot;
    }

    public static float getAngle(ArrayList<Integer> target, ArrayList<Integer> org) {
        return (float) Math.toDegrees(Math.atan2(target.get(0) - org.get(0), target.get(1) - org.get(1)));
    }

    public static void insertSpot(List<ArrayList<Integer>> spots, int x, int y){
        ArrayList<Integer> newSpot = new ArrayList<Integer>();
        newSpot.add(x);
        newSpot.add(y);
        spots.add(newSpot);
    }

    public static ArrayList<Integer> findStartPoint(List<ArrayList<Integer>> spots){
        int max = 0;
        ArrayList<Integer> startSpot = null;
        for(int inx = 0; inx < spots.size(); inx++){
            ArrayList<Integer> spot = spots.get(inx);
            if(inx == 0){
                startSpot = spot;
                continue;
            }
            if(spot.get(0) >= max){
                if(startSpot != null && startSpot.get(1) < spot.get(1)){
                    startSpot = spot;
                }
            }
        }
        return startSpot;
    }

}
