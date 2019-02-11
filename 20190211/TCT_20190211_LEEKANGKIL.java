import java.util.HashMap;

public class   TCT_20190211_LEEKANGKIL{

	public static void main(String args[])  {
		String input ="ABCABCBBAAACC";
		TCT_20190211_LEEKANGKIL lkk = new TCT_20190211_LEEKANGKIL();
		System.out.println( lkk.checkMsg("BAPC") ); 
		System.out.println(lkk.checkMsg("AABA") );
		System.out.println(lkk.checkMsg("ABCABCBBAAACC"));
	}
	
	public String checkMsg(String input){
		HashMap <String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<input.length();i++){
			String key = String.valueOf(input.charAt(i));
			
			if(!map.containsKey(key)) map.put(key, 1);
			else map.put(key, map.get(key)+1);
		}
		
		for(String key:map.keySet()){
			int cnt = map.get(key);
			if(cnt % 3 == 0)	return "FAKE";
		}
		return "OK";
	}
	
}


