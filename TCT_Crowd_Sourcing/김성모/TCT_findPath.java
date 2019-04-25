import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TCT_findPath {
    // x좌표 : 행, y 좌표 : 열
    private static HashMap<String, ArrayList<Point>> inputMap = new HashMap<String, ArrayList<Point>>();
    private static HashMap<String, ArrayList<ArrayList<Point>>> feasibleMap = new HashMap<String, ArrayList<ArrayList<Point>>>();
    private static HashMap<String, ArrayList<Point>> finalResultMap = new HashMap<String, ArrayList<Point>>();
    TCT_findPath(){
        // Input Condition
        inputMap.put("A", new ArrayList<Point>());
        inputMap.put("B", new ArrayList<Point>());
        inputMap.put("C", new ArrayList<Point>());
        inputMap.put("D", new ArrayList<Point>());
        inputMap.put("E", new ArrayList<Point>());
        
        // Test Case 1
        inputMap.get("A").add(new Point(1,2));  inputMap.get("A").add(new Point(4,1));
        inputMap.get("B").add(new Point(1,3));  inputMap.get("B").add(new Point(5,1));
        inputMap.get("C").add(new Point(1,4));  inputMap.get("C").add(new Point(5,4));
        inputMap.get("D").add(new Point(2,4));  inputMap.get("D").add(new Point(3,3));
        inputMap.get("E").add(new Point(4,4));  inputMap.get("E").add(new Point(5,3));
        
        // Test Case 2
//        inputMap.get("A").add(new Point(4,1));  inputMap.get("A").add(new Point(2,5));
//        inputMap.get("B").add(new Point(5,1));  inputMap.get("B").add(new Point(4,2));
//        inputMap.get("C").add(new Point(2,2));  inputMap.get("C").add(new Point(5,3));
//        inputMap.get("D").add(new Point(2,3));  inputMap.get("D").add(new Point(4,4));
//        inputMap.get("E").add(new Point(3,5));  inputMap.get("E").add(new Point(5,4));
        
    }
    
    public static void main(String[] args) {
        TCT_findPath obj = new TCT_findPath();
        // 1. Key 별 가능한 Path 탐색
        obj.findFeasiblePath();
        
        // 2. 경로가 중복되지 않는 Path 조합 탐색
        HashMap<String, ArrayList<Point>> result = obj.getResultPath();
        
        // 3. 결과 출력
        if( result.isEmpty() ){
            System.out.println( "Invalid Input Condition" );
        }else{
            for( String key : result.keySet() ){
                System.out.print(key + " : ");
                for( int inx = 0; inx < result.get(key).size(); inx++ ){
                    if( inx !=0 ) System.out.print( " -> " );
                    System.out.print("(" + result.get(key).get(inx).x + "," +result.get(key).get(inx).y + ")");
                }
                System.out.println();
            }
        }
    }

    private void findFeasiblePath(){
        ArrayList<Point> initList;
        // key, pathList, currentPoint, endPoint
        for( String key : inputMap.keySet() ){
         // Feasible Alternative
            feasibleMap.put(key, new ArrayList<ArrayList<Point>>());
            
            initList = new ArrayList<Point>();
            initList.add(inputMap.get(key).get(0));
            findPath( key, initList, inputMap.get(key).get(0), inputMap.get(key).get(1) ); //재귀
        }
    }

    private void findPath(String key, ArrayList<Point> currPath, Point currPoint, Point endPoint){
        if( currPoint.equals(endPoint) ){
            feasibleMap.get(key).add(currPath);
        }else{
            // 상
            Point moveUp = new Point(currPoint.x-1, currPoint.y);
            if( moveValidation( key, currPath, moveUp ) ) {
                ArrayList<Point> nextList = (ArrayList<Point>)currPath.clone();
                nextList.add(moveUp);
                findPath( key, nextList, moveUp, endPoint );
            }
            // 하
            Point moveDown = new Point(currPoint.x+1, currPoint.y);
            if( moveValidation( key, currPath, moveDown ) ){
                ArrayList<Point> nextList = (ArrayList<Point>)currPath.clone();
                nextList.add(moveDown);
                findPath( key, nextList, moveDown, endPoint );
            }
            // 좌
            Point moveLeft = new Point(currPoint.x, currPoint.y-1);
            if( moveValidation( key, currPath, moveLeft ) ){
                ArrayList<Point> nextList = (ArrayList<Point>)currPath.clone();
                nextList.add(moveLeft);
                findPath( key, nextList, moveLeft, endPoint );
            }
            // 우
            Point moveRight = new Point(currPoint.x, currPoint.y+1);
            if( moveValidation( key, currPath, moveRight ) ){
                ArrayList<Point> nextList = (ArrayList<Point>)currPath.clone();
                nextList.add(moveRight);
                findPath( key, nextList, moveRight, endPoint );
            }
        }
    }

    private boolean moveValidation(String tempkey, ArrayList<Point> tempPath, Point movePoint){
        boolean isValid = true;
        // 1. 경계 체크
        int size = inputMap.size();
        if( movePoint.x > size || movePoint.y > size || movePoint.x < 1 || movePoint.y < 1 ){
            isValid = false;
        }
        // 2. 과거 경로 중복 체크
        for( int inx = 0; inx < tempPath.size(); inx++ ){
            if( tempPath.get(inx).equals( movePoint ) ){
                isValid = false;
            }
        }
        // 3. Input Point 회피 체크
        for( String key : inputMap.keySet() ){
            if( tempkey.equals(key) ) continue;
            if( movePoint.equals(inputMap.get(key).get(0)) || movePoint.equals(inputMap.get(key).get(1)) ){
                isValid = false;
            }
        }
        return isValid;
    }
    
    private HashMap<String, ArrayList<Point>> getResultPath(){
        HashMap<String, ArrayList<Point>> tempResultMap = new HashMap<String, ArrayList<Point>>();
        HashSet<Point> totalSet = new HashSet<Point>();
        HashSet<String> remainKeySet = new HashSet<String>();
        for( String key : inputMap.keySet() ){
            remainKeySet.add(key);
        }
        findResultPath( tempResultMap, totalSet, remainKeySet ); //재귀
        return finalResultMap;
    }

    private void findResultPath(HashMap<String, ArrayList<Point>> resultMap, HashSet<Point> totalSet, HashSet<String> remainKeySet){
        if( remainKeySet.size() == 0 ){
            finalResultMap = resultMap;
        }else{
            HashSet<String> keySet =(HashSet<String>)remainKeySet.clone();
            String key = (String)keySet.toArray()[0];
            keySet.remove(key);
            
            for( int inx = 0; inx <  feasibleMap.get(key).size(); inx++ ){
                boolean isVaild = true;
                HashSet<Point> tempTotalSet = (HashSet<Point>)totalSet.clone();
                HashMap<String, ArrayList<Point>> tempResultMap = (HashMap<String, ArrayList<Point>>)resultMap.clone();
                for( int jnx = 0; jnx < feasibleMap.get(key).get(inx).size(); jnx++ ){
                    if( tempTotalSet.contains(feasibleMap.get(key).get(inx).get(jnx)) ){
                        isVaild = false;
                        break;
                    }
                    tempTotalSet.add( feasibleMap.get(key).get(inx).get(jnx) );
                }
                if( isVaild ){
                    tempResultMap.put(key, feasibleMap.get(key).get(inx));
                    findResultPath( tempResultMap, tempTotalSet, keySet );
                }
            }
        }
    }
}
