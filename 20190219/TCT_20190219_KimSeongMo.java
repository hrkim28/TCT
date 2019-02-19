import java.util.Arrays;

public class TCT_20190219_KimSeongMo {
    
    public static void main(String[] args){
        TCT_20190219_KimSeongMo obj = new TCT_20190219_KimSeongMo();
        // “img12.png”, “img10.png”, “img02.png”, “img1.png”, “IMG01.GIF”, “img2.JPG”
        String input1 = "img12.png";
        String input2 = "img10.png";
        String input3 = "img02.png";
        String input4 = "img1.png";
        String input5 = "IMG01.GIF";
        String input6 = "img2.JPG";
        String input7 = "img12345a444aa.JPG";
        
        System.out.println(Arrays.toString( obj.getDeivedPart(input1) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input2) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input3) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input4) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input5) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input6) ));
        System.out.println(Arrays.toString( obj.getDeivedPart(input7) ));
        
        // 나누기 까지...    Sorting은 나중에 :(
        
    }
    
    private String[] getDeivedPart(String input){
        int cnt = 0;
        int startIdx = 0;
        String[] strArr = new String[3];
        for( int inx = 1; inx < input.length(); inx++ ){
            if( input.charAt(inx) >= '0' && input.charAt(inx) <= '9'){
                if(cnt == 0) startIdx = inx; 
                cnt++;
            }else if( cnt > 4 ) {
                startIdx = 0; cnt = 0;
            }else if( cnt > 0 ){
                break;
            }
        }
        strArr[0] = input.substring(0, startIdx);
        strArr[1] = input.substring(startIdx, startIdx+cnt);
        strArr[2] = input.substring(startIdx+cnt, input.length());
        return strArr;
    }

}
