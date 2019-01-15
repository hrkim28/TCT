int iFirst = 0;
int iSecond = 1;
int iSum = 0;
int iTemp = 0;

String strResult = "";

for(int i=0 ; i<n+1 ; i++) {
	
	if(i==0) {
		iSum = iFirst;
	}
	else if(i==1) {
		iSum = iFirst + iSecond;
		
		iFirst = iSecond;
		iSecond = iSum;

		strResult += String.valueOf(iSum) + ",";	
	}
	else {
		iSum = iFirst + iSecond;
		
		iTemp = iFirst;
		iFirst = iSecond;
		iSecond = iSecond + iTemp;
	}
	
	strResult += String.valueOf(iSum) + ",";
}

strResult = strResult.substring(0, strResult.length()-1);
System.out.println(strResult);