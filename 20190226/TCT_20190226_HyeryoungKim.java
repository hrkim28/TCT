import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TCT_20190226_HyeryoungKim {
	
	private static List<KeyBoard> list = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TCT_20190226_HyeryoungKim tct = new TCT_20190226_HyeryoungKim();
		
		list = tct.originKeyboardInfo();
		
		int[] case1 = {2,3,4,5,6,7,8,9,1};
		String message1 = "klor";
		tct.getPhoneNumber(case1, message1);
		
		int[] case2 = {7,8,9,1,2,3,6,5,4};
		String message2 = "djevojka";
		tct.getPhoneNumber(case2, message2);
		
		int[] case3 = {9,8,7,6,5,4,3,2,1};
		String message3 = "skakavac";
		tct.getPhoneNumber(case3, message3);
	}
	
	private void getPhoneNumber(int[] input, String message) {
		String oldNumber = "";
		String newNumber = "";
		int preIndex = 0;
		int curIndex = 0;
		for ( int idx = 0 ; idx < message.length() ; idx++ ) {
			String alpha = String.valueOf(message.charAt(idx));
			
			List<KeyBoard> keyList = 
			list.stream()
			.filter(keyboard -> alpha.equals(keyboard.getAlphabet()) )
			.collect(Collectors.toList());
			
			if ( idx == 0 ) preIndex = keyList.get(0).getIndex();
			curIndex = keyList.get(0).getIndex();
			
			for ( int jdx = 0 ; jdx < keyList.get(0).getNumber() ; jdx++ ) {
				oldNumber += (curIndex+1);
			}
			
//			if ( preIndex == curIndex ) {
//				oldNumber += "#";
//			}
			
			preIndex = curIndex;
		}
		
		for ( int idx = 0 ; idx < oldNumber.length() ; idx++ ) {
			String str = String.valueOf(oldNumber.charAt(idx));
			if ( "#".equals(str) ) {
				newNumber += "#";
			} else {
				for ( int jdx = 0 ; jdx < input.length ; jdx++ ) {
					if ( str.equals(String.valueOf(input[jdx]) ) ) {
						newNumber += (jdx+1);
					} else {
						continue;
					}
				}
			}
		}
		
		System.out.println(newNumber);
	}
	
	private List<KeyBoard> originKeyboardInfo() {
		List<KeyBoard> keyList = new ArrayList<KeyBoard>();
		
		KeyBoard keyboard = new KeyBoard("", 0, 1);
		keyList.add(keyboard);
		
		int chr = 'a';
		int idx = 1;
		int length = 3;
		while ( chr <= 'z' ) {
			if ( idx == 6 || idx == 8 ) length = 4;
			else length = 3;
			
			for ( int jdx = 1 ; jdx <= length ; jdx++ ) {
				keyboard = new KeyBoard(String.valueOf((char)chr), idx, jdx);
				keyList.add(keyboard);
				chr++;
			}
			idx++;
		}
		return keyList;
	}
}

class KeyBoard {
	private String alphabet = "";
	private int index = 0;
	private int number = 0;
	
	public KeyBoard() {}
	
	public KeyBoard(String iAlphabet, int iIndex, int iNumber) {
		alphabet = iAlphabet; index = iIndex; number = iNumber;
	}
		
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}