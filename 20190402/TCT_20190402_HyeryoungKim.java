import java.util.HashMap;
import java.util.Map;

public class TCT_20190402_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190402_HyeryoungKim tct = new TCT_20190402_HyeryoungKim();
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String str1 = tct.getNotCompletionPlayer(participant1, completion1);
        System.out.println(str1);
        
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String str2 = tct.getNotCompletionPlayer(participant2, completion2);
        System.out.println(str2);
        
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        String str3 = tct.getNotCompletionPlayer(participant3, completion3);
        System.out.println(str3);
    }

    public String getNotCompletionPlayer(String[] participant, String[] completion) {
        String player = "";
        Map<String, Integer> participantMap = new HashMap<String, Integer>();
        Map<String, Integer> completionMap = new HashMap<String, Integer>();
        
        for ( String person : participant ) {
            if ( participantMap.containsKey(person) ) {
                participantMap.put(person, participantMap.get(person) + 1);
            } else {
                participantMap.put(person, 1);
            }
        }
        
        for ( String success : completion ) {
            if ( completionMap.containsKey(success) ) {
                participantMap.put(success, completionMap.get(success) + 1);
            } else {
                completionMap.put(success, 1);
            }
        }
        
        for ( Map.Entry<String, Integer> map : participantMap.entrySet() ) {
            if ( completionMap.get(map.getKey()) != participantMap.get(map.getKey()) ) {
                player = map.getKey();
            }
        }
        return player;
    }
}