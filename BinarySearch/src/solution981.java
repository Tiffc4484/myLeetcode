import java.util.*;
public class solution981 {
    /** Initialize your data structure here. */
    HashMap<String, HashMap<Integer, String>> map = new HashMap<>();

    public solution981() {
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new HashMap<Integer, String>());

        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        String result = "";
        HashMap<Integer, String> curr = map.get(key);
        for (int i = timestamp; i >= 0; i--) {
            if (curr.containsKey(i)) {
                result = curr.get(i);
                return result;
            }
        }
        return result;
    }
}
