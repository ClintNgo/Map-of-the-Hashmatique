import java.util.HashMap;
import java.util.Set;

public class HashMapSong {
    public static void main(String[] args) {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Straight Up & Down", "Girl I bet your momma named you good lookin..");
        songMap.put("24K Magic", "Tonight I just want to take you higher Throw your hands up in the sky Let's set this party off right...");
        songMap.put("Valerie", " Well sometimes I go out by myself...");
        songMap.put("Leave The Door Open", "Say baby, say baby, say baby...");
        Set<String> keys = songMap.keySet();
        for(String key : songMap.keySet()) {
            System.out.println(key);
            System.out.println(String.format("Track- %s | lyrics- %s", key, songMap.get(key)));    
        }
    }
}