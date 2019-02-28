import java.util.LinkedHashMap;

public class   TCT_20190228_LeeKangKil{

	public static void main(String args[])  {
	      System.out.println(getRisk(3, new String[]{"전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"})); 
	      System.out.println(getRisk(3, new String[]{"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"})); 
	      System.out.println(getRisk(2, new String[]{"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"})); 
	      System.out.println(getRisk(5, new String[]{"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"})); 
	        
	}
    public static int getRisk(final int size, String[] nameArray) {
        LinkedHashMap<String, Integer> resultMap = new LinkedHashMap<String, Integer>() {
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry<String, Integer> old) {
            	 return size() > size ? true : false;
            }
        };
        
        int risk = 0;
        for(String name : nameArray) {
            if(resultMap.containsKey(name)) risk += 1;
            else {
                resultMap.put(name, 1); 
                risk += 5;
            }
        }
        return risk;
    }
}