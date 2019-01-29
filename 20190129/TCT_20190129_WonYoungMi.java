import java.util.ArrayList;
import java.util.List;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190129_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 29.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190129_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190129_WonYoungMi {
    public static void main(String[] args){
        genCalMethod( "9+5-4+8" );
        genCalMethod( "5+6*3-6/2+5" );
    }
    
    private static void genCalMethod( String input ){
        StringBuffer sbTemp = new StringBuffer();
        sbTemp.append( input );
        
        // 곱하기 나누기
        String temp = genFirst( input, getStrList( input.split("") ) );
        
        // 더하기 빼기
        genSecond( temp, getStrList( temp.split("") ) );
    }
    
    private static String genFirst( String input, List<String> list ){
        String temp = input;
        for( int inx = 0; inx < list.size(); inx++ ){
            if( list.get(inx).equals("/") || list.get(inx).equals("*") ){
                temp = getRemainStr( input, inx );
                System.out.println( temp );
                temp = genFirst( temp, getStrList( temp.split("") ) );
                break;
            }
        }
        return temp;
    }
    
    private static void genSecond( String input, List<String> list ){
        String temp = "";
        for( int inx = 0; inx < list.size(); inx++ ){
            if( list.get(inx).equals("+") || list.get(inx).equals("-") ){
                temp = getRemainStr( input, inx );
                System.out.println( temp );
                genSecond( temp, getStrList( temp.split("") ) );
                break;
            }
        }
    }
    
    private static List<String> getStrList( String[] input ){
        List<String> list = new ArrayList<String>();
        int beforeIndex = 0;
        String numValue = "";
        for( int inx = 0; inx < input.length; inx++ ){
            numValue = "";
            if( input[inx].equals("+")
                    || input[inx].equals("-")
                    || input[inx].equals("*")
                    || input[inx].equals("/")){
                for( int jnx = beforeIndex; jnx < inx; jnx++ ){
                    numValue += input[jnx];
                }
                list.add( numValue );
                list.add( input[inx] );
                beforeIndex = inx + 1;
            }
            if( inx == input.length - 1 ){
                for( int jnx = beforeIndex; jnx <= inx; jnx++ ){
                    numValue += input[jnx];
                }
                list.add( numValue );
            }
        }
        return list;
    }
    
    private static String getRemainStr( String input, int targetIndex ){
        List<String> list = getStrList( input.split("") );
        StringBuffer sbResult = new StringBuffer();
        for( int inx = 0; inx < list.size(); inx++ ){
            if( inx < targetIndex - 1 ){
                sbResult.append( list.get(inx) );
            }
            else if( inx == targetIndex - 1 || inx == targetIndex + 1 ){
                continue;
            }
            else if( inx == targetIndex ){
                sbResult.append( calNum(
                        Integer.parseInt(list.get(inx-1)),
                        Integer.parseInt(list.get(inx+1)),
                        list.get(inx)) );
            }
            else{
                sbResult.append( list.get(inx) );
            }
        }
        return sbResult.toString();
    }
    
    private static int calNum( int left, int right, String operator ){
        if( operator.equals("+") ){
            return left + right;
        }
        else if( operator.equals("-") ){
            return left - right;
        }
        else if( operator.equals("*") ){
            return left * right;
        }
        else if( operator.equals("/") ){
            return left / right;
        }
        else{
            return 0;
        }
    }
}
