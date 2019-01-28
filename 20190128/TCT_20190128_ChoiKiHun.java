
public class TCT_20190128 {

	public static void main(String[] args){
		
		String strSentence = "I think I'm lost.";
		getMaxCountChar(strSentence);
		
		strSentence = "I think I'm lost.I can't tell.";
		getMaxCountChar(strSentence);

		strSentence = "I think I'm lost. I can't tell what's where.";
		getMaxCountChar(strSentence);
    }
    
    public static void getMaxCountChar(String strSentence){

    	String strChecked = "";
    	String strMaxUsedChar = "";
    	int maxCount = 0;
    	
    	strSentence = getAlphabetOnly(strSentence);
    	strSentence = strSentence + " ";
    	
    	for(int i=0 ; i<strSentence.length() ; i++) {
    		String currentChar = strSentence.substring(i, i+1);
    		
    		if(strChecked.contains(currentChar))
    			continue;
    		
    		String[] sentenceArray = strSentence.split(currentChar);
    		if(sentenceArray.length-1 > maxCount) {
    			strMaxUsedChar = currentChar;
    			maxCount = sentenceArray.length -1;
    			strChecked += currentChar;
    		}
    		else if(sentenceArray.length-1 == maxCount) {
    			strMaxUsedChar += "," + currentChar;
    			strChecked += currentChar;
    		}
    	}
    	
    	System.out.println("가장많이 쓰인 알파벳 : " + strMaxUsedChar + " = " + maxCount + " 회");
    } 
    
    public static String getAlphabetOnly(String strSentence) {
    	
    	String strResult = "";
    	strSentence = strSentence.replace(" ", "");
    	strSentence = strSentence.toLowerCase();
    	String strAZ = "az";
    	
    	for(int i=0 ; i<strSentence.length(); i++) {
    		if(strSentence.charAt(i) >= strAZ.charAt(0) && strSentence.charAt(i) <= strAZ.charAt(1))
    			strResult += strSentence.charAt(i);
    	}
    	
    	return strResult;
    }
	
}
