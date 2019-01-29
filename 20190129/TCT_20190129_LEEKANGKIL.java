import java.util.ArrayList;

public class   TCT_20190129_LEEKANGKIL{

	public static void main(String args[])  {
		TCT_20190129_LEEKANGKIL lkk = new TCT_20190129_LEEKANGKIL();
		lkk.printProgress("5+6*3-6/2+5");
		//lkk.printProgress("9+5-4+8");
	}
	
	public void printProgress(String strInput){
		ArrayList<String> strArrayList = convertArrayList(strInput);
		while(strArrayList.size()!=1){
			int pos = -1;
			double result = 0;
			
			pos = min (strArrayList.indexOf("*"), strArrayList.indexOf("/"));

			if(pos<0){
				pos = min (strArrayList.indexOf("+"), strArrayList.indexOf("-"));
			}
			result = getCalResult(strArrayList.get(pos-1), strArrayList.get(pos+1), strArrayList.get(pos));
			
			strArrayList.set(pos, String.valueOf(result).replace(".0", "") );
			strArrayList.remove(pos+1);
			strArrayList.remove(pos-1);
			
			printList(strArrayList);
		}
	}
	
	public void printList(ArrayList<String> strArrayList){
		for(String str : strArrayList){
			System.out.print(str);
		}
		System.out.println();
	}
	
	public int min(int a, int b){
		if(a<0 && b<0) return -1;
		if(b<0 && a>=0) return a;
		if(a<0 && b>=0) return b;
		
		if(a<b) return a;
		else return b;
	}
	
	public double getCalResult(String num1, String num2, String op){
		double a = Double.valueOf(num1);
		double b = Double.valueOf(num2);
		
		switch(op){
			case "+":
				return a+b;
			case "-":
				return a-b;
			case "*":
				return a*b;
			case "/":
				return (double)a/(double)b;
			default:
				return 0;
		}
	}
	
	public ArrayList<String> convertArrayList(String strInput){
		ArrayList<String> inputArray = new ArrayList<String>();
		String tmp ="";
		
		for(int i=0; i<strInput.length();i++){
			char ch = strInput.charAt(i);
			if( (int)ch >=48 && (int)ch <=57 ){
				tmp += ch;
			} else {
				inputArray.add(tmp);
				inputArray.add(String.valueOf(ch));
				tmp ="";
			}
		}
		if(!tmp.equals("")) inputArray.add(tmp);
	return inputArray;
		
	}

}