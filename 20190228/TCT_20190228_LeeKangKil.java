import java.util.LinkedHashMap;

public class   TCT_20190228_LeeKangKil{

	public static void main(String args[])  {
	      System.out.println(getRisk(3, new String[]{"������", "�տ���", "������", "����", "����", "������", "�տ���", "������", "����", "����"})); 
	      System.out.println(getRisk(3, new String[]{"������", "�տ���", "������", "������", "�տ���", "������", "������", "�տ���", "������"})); 
	      System.out.println(getRisk(2, new String[]{"������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"})); 
	      System.out.println(getRisk(5, new String[]{"������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"})); 
	        
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